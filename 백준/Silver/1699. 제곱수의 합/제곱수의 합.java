import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

	static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
		dp = new int[N + 1];

		// bottom-up
		for (int i = 1; i <= N; i++) {
			dp[i] = i;

			for (int k = 1; k * k <= i; k++) {
				dp[i] = Math.min(dp[i], dp[i - k * k] + 1);
			}
		}
		// for (int i = 1; i <= N; i++) {
		// 	topDown(i);
		// }

		bw.write(String.valueOf(dp[N]));
		bw.flush();
		bw.close();
    }

	public static int topDown(int n) {
		if (n == 1) return dp[n] = 1;

		if (dp[n] == 0) {
			dp[n] = n;

			for (int i = 1; i * i <= n; i++) {
				dp[n] = Math.min(dp[n], topDown(n - i * i) + 1);
			}
		}

		return dp[n];
	}
}