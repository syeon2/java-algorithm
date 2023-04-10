import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

	static int[] dp;
	static int MOD = 10_007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
		dp = new int[N + 1];

		// bottom-up
		// for (int i = 1; i <= N; i++) {
		// 	if (i == 1) dp[i] = 1;
		// 	else if (i == 2) dp[i] = 3;
		// 	else dp[i] = (dp[i - 1] + (2 * dp[i - 2])) % MOD;
		// }

		int answer = topDown(N);

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }

	public static int topDown(int n) {
		if (n == 1) return dp[n] = 1;
		else if (n == 2) return dp[n] = 3;

		if (dp[n] == 0) {
			dp[n] = (topDown(n - 1) + (2 * topDown(n - 2))) % MOD;
		}

		return dp[n];
	}
}