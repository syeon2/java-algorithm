import java.io.*;

public class Main {

	static int[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		dp = new int[N + 1];

		// bottom-up
		// for (int i = 1; i <= N; i++) {
		// 	dp[i] = i;
		//
		// 	for (int k = 1; k * k <= i; k++) {
		// 		dp[i] = Math.min(dp[i], dp[i - k * k] + 1);
		// 	}
		// }

		for (int i = 1; i <= N; i++) {
			topDown(i);
		}

		bw.write(String.valueOf(dp[N]));
		bw.flush();
		bw.close();
	}

	public static int topDown(int N) {
		if (N == 1) return dp[N] = 1;

		if (dp[N] == 0) {
			dp[N] = N;

			for (int i = 1; i * i <= N; i++) {
				dp[N] = Math.min(dp[N], topDown(N - i * i) + 1);
			}
		}

		return dp[N];
	}
}