import java.io.*;

public class Main {

	static int[] dp = new int[10_001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		// bottom-up
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		for (int i = 4; i < dp.length; i++) {
			dp[i] = dp[i - 3] + (i / 2) + 1;
		}

		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());

			// int answer = topDown(N);

			sb.append(dp[N]).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	public static int topDown(int n) {
		if (n == 1) return dp[n] = 1;
		else if (n == 2) return dp[n] = 2;
		else if (n == 3) return dp[n] = 3;

		if (dp[n] == 0) {
			dp[n] = topDown(n - 3) + (n / 2) + 1;
		}

		return dp[n];
	}
}