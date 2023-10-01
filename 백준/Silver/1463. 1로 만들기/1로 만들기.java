import java.io.*;

public class Main {

	static int[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		dp = new int[N + 1];

		// bottom-up
		// for (int i = 2; i <= N; i++) {
		// 	dp[i] = dp[i - 1] + 1;
		// 	if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
		// 	if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
		// }

		int answer = topDown(N);

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

	public static int topDown(int N) {
		if (N <= 1) return dp[N];

		if (dp[N] == 0) {
			dp[N] = N;

			if (N % 3 == 0) dp[N] = Math.min(dp[N], topDown(N / 3) + 1);
			if (N % 2 == 0) dp[N] = Math.min(dp[N], topDown(N / 2) + 1);
			dp[N] = Math.min(dp[N], topDown(N - 1) + 1);
		}

		return dp[N];
	}
}