import java.io.*;

public class Main {

	static int[][] dp;
	static int MOD = 9901;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		dp = new int[N + 1][3];

		// bottom-up
		for (int i = 1; i <= N; i++) {
			if (i == 1)
				dp[i][0] = dp[i][1] = dp[i][2] = 1;
			else {
				dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % MOD;
				dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
				dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
			}
		}
		
		// top-down
		// for (int i = 1; i <= N; i++) {
		// 	for (int k = 0; k < 3; k++) {
		// 		topDown(i, k);
		// 	}
		// }

		int answer = 0;
		for (int i = 0; i < 3; i++) {
			answer += dp[N][i];
			answer %= MOD;
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

	public static int topDown(int N, int i) {
		if (N == 1) return dp[N][i] = 1;

		if (dp[N][i] == 0) {
			if (i == 0) dp[N][i] = (topDown(N - 1, 0) + topDown(N - 1, 1) + topDown(N - 1, 2)) % MOD;
			else if (i == 1) dp[N][i] = (topDown(N - 1, 0) + topDown(N - 1, 2)) % MOD;
			else if (i == 2) dp[N][i] = (topDown(N - 1, 0) + topDown(N - 1, 1)) % MOD;
		}

		return dp[N][i];
	}
}