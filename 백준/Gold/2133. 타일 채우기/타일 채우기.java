import java.io.*;

public class Main {

	static long[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		dp = new long[N + 1];

		// bottom-up
		// dp[0] = 1;
		// if (N > 1) dp[2] = 3;
		// for (int i = 4; i <= N; i += 2) {
		// 	dp[i] = dp[i - 2] * 3;
		//
		// 	for (int k = 4; k <= i; k += 2) {
		// 		dp[i] += dp[i - k] * 2;
		// 	}
		// }

		topDown(N);

		bw.write(String.valueOf(dp[N]));
		bw.flush();
		bw.close();
	}

	public static long topDown(int i) {
		if (i % 2 != 0) return 0;
		if (i == 0) return dp[i] = 1;
		else if (i == 2) return dp[i] = 3;

		if (dp[i] == 0) {
			dp[i] = topDown(i - 2) * 3;

			for (int k = 4; k <= i; k += 2) {
				dp[i] += topDown(i - k) * 2;
			}
		}

		return dp[i];
	}
}