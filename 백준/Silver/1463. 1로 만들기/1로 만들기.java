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
		for (int i = 2; i <= N; i++) {
			dp[i] = dp[i - 1] + 1;

			if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
			if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
		}
		// int answer = topDown(N);

		bw.write(String.valueOf(dp[N]));
		bw.flush();
		bw.close();
    }

	public static int topDown(int n) {
		if (n == 1) return dp[n] = 0;

		if (dp[n] == 0) {
			dp[n] = n - 1;

			if (n % 3 == 0) dp[n] = Math.min(dp[n], topDown(n / 3) + 1);
			if (n % 2 == 0) dp[n] = Math.min(dp[n], topDown(n / 2) + 1);
			dp[n] = Math.min(dp[n], topDown(n - 1) + 1);
		}

		return dp[n];
	}
}