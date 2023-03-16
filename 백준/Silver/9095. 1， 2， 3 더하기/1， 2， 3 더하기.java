import java.io.*;

public class Main {

	static int[] dp = new int[11];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		// bottom-up
		// for (int i = 1; i < 11; i++) {
		// 	if (i == 1) dp[1] = 1;
		// 	else if (i == 2) dp[2] = 2;
		// 	else if (i == 3) dp[3] = 4;
		// 	else dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		// }

		topDown(10);

		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());

			sb.append(dp[N]).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	private static int topDown(int N) {
		if (N == 1) return dp[N] = 1;
		else if (N == 2) return dp[N] = 2;
		else if (N == 3) return dp[N] = 4;

		if (dp[N] == 0) {
			dp[N] = topDown(N - 1) + topDown(N - 2) + topDown(N - 3);
		}

		return dp[N];
	}
}