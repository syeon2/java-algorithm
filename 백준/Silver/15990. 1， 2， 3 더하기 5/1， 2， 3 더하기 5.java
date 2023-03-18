import java.io.*;

public class Main {

	static int[][] dp = new int[100001][3];
	static int MOD = 1_000_000_009;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		// bottom-up
		for (int i = 1; i <= 100000; i++) {
			if (i == 1) dp[i][0] = 1;
			else if (i == 2) dp[i][1] = 1;
			else if (i == 3) dp[i][0] = dp[i][1] = dp[i][2] = 1;
			else {
				dp[i][0] = (dp[i - 1][1] + dp[i - 1][2]) % MOD;
				dp[i][1] = (dp[i - 2][0] + dp[i - 2][2]) % MOD;
				dp[i][2] = (dp[i - 3][0] + dp[i - 3][1]) % MOD;
			}
		}

		// top-down
		// dp[1][0] = 1;
		// dp[2][1] = 1;
		// dp[3][0] = dp[3][1] = dp[3][2] = 1;

		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());

			// top-down
			// for (int i = 0; i < 3; i++) {
			// 	topDown(N, i);
			// }

			int answer = 0;
			for (int i = 0; i < 3; i++) {
				answer += dp[N][i];
				answer %= MOD;
			}

			sb.append(answer).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	public static int topDown(int N, int i) {
		if (N < 4) return dp[N][i];

		if (dp[N][i] == 0) {
			if (i == 0) dp[N][0] = (topDown(N - 1, 1) + topDown(N - 1, 2)) % MOD;
			else if (i == 1) dp[N][1] = (topDown(N - 2, 0) + topDown(N - 2, 2)) % MOD;
			else dp[N][2] = (topDown(N - 3, 0) + topDown(N - 3, 1)) % MOD;
		}

		return dp[N][i];
	}
}