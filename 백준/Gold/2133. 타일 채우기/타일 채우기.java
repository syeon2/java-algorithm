import java.io.*;

public class Main {

	static long[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		dp = new long[N + 1];

		// bottom-up
		dp[0] = 1;
		if (N > 1) dp[2] = 3;
		for (int i = 4; i <= N; i += 2) {
			dp[i] = dp[i - 2] * 3;

			for (int k = 4; k <= i; k += 2) {
				dp[i] += dp[i - k] * 2;
			}
		}

		bw.write(String.valueOf(dp[N]));
		bw.flush();
		bw.close();
	}
}