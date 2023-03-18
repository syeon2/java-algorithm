import java.io.*;
import java.util.Arrays;

public class Main {

	static int[][] dp;
	static int MOD = 1_000_000_000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		dp = new int[N + 1][10];

		// bottom-up
		Arrays.fill(dp[1], 1);
		dp[1][0] = 0;

		for (int i = 0; i < 10; i++) {
			topDown(N, i);
		}
		// for (int i = 2; i <= N; i++) {
		// 	for (int k = 0; k < 10; k++) {
		// 		if (k == 0) dp[i][k] = dp[i - 1][k + 1];
		// 		else if (k == 9) dp[i][k] = dp[i - 1][k - 1];
		// 		else dp[i][k] = (dp[i - 1][k - 1] + dp[i - 1][k + 1]) % MOD;
		// 	}
		// }

		int answer = 0;
		for (int i = 0; i < 10; i++) {
			answer += dp[N][i];
			answer %= MOD;
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

	public static int topDown(int N, int i) {
		if (N == 1) return dp[N][i];

		if (dp[N][i] == 0) {
			if (i == 0) dp[N][i] = topDown(N - 1, i + 1);
			else if (i == 9) dp[N][i] = topDown(N - 1, i - 1);
			else dp[N][i] = (topDown(N - 1, i - 1) + topDown(N - 1, i + 1)) % MOD;
		}

		return dp[N][i];
	}
}