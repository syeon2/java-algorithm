import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int[][] dp;
	static int MOD = 1_000_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

		dp = new int[N + 1][10];

		// bottom-up
		// for (int i = 1; i <= N; i++) {
		// 	if (i == 1) {
		// 		for (int j = 1; j < 10; j++) {
		// 			dp[i][j] = 1;
		// 		}
		// 	} else {
		// 		for (int j = 0; j < 10; j++) {
		// 			if (j == 0) dp[i][j] = dp[i - 1][1];
		// 			else if (j == 9) dp[i][j] = dp[i - 1][8];
		// 			else dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % MOD;
		// 		}
		// 	}
		// }

		for (int i = 0; i < 10; i++) {
			topDown(N, i);
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

	public static int topDown(int n, int i) {
		if (n == 1) {
			if (i == 0) return dp[n][i] = 0;
			else return dp[n][i] = 1;
		}

		if (dp[n][i] == 0) {
			if (i == 0) dp[n][i] = topDown(n - 1, 1);
			else if (i == 9) dp[n][i] = topDown(n - 1, 8);
			else dp[n][i] = (topDown(n - 1, i - 1) + topDown(n - 1, i + 1)) % MOD;
		}

		return dp[n][i];
	}
}