import java.io.*;
import java.util.Arrays;

public class Main {

	static int[][] dp;
	static int MOD = 10007;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		dp = new int[N + 1][10];

		// bottom-up
		// Arrays.fill(dp[1], 1);
		// for (int i = 2; i <= N; i++) {
		// 	for (int k = 0; k < 10; k++) {
		// 		for (int l = 0; l <= k; l++) {
		// 			dp[i][k] += dp[i - 1][l];
		// 			dp[i][k] %= MOD;
		// 		}
		// 	}
		// }

		// top-down
		for (int i = 1; i <= N; i++) {
			for (int k = 0; k < 10; k++) {
				topDown(i, k);
			}
		}

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
		if (N == 1) return dp[N][i] = 1;

		if (dp[N][i] == 0) {
			for (int k = 0; k <= i; k++) {
				dp[N][i] += topDown(N - 1, k);
				dp[N][i] %= MOD;
			}
		}

		return dp[N][i];
	}
}