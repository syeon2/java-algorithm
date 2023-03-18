import java.io.*;

public class Main {

	static int[] dp = new int[10001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		// bottom-up
		// for (int i = 1; i <= 10000; i++) {
		// 	if (i < 4) dp[i] = i;
		// 	else dp[i] = 1 + (i / 2) + dp[i - 3];
		// }

		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());

			// top-down
			topDown(N);

			sb.append(dp[N]).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	public static int topDown(int N) {
		if (N < 4) return dp[N] = N;

		if (dp[N] == 0) {
			dp[N] = 1 + (N / 2) + topDown(N - 3);
		}

		return dp[N];
	}
}