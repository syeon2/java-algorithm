import java.io.*;

public class Main {

	static long[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		dp = new long[N + 1][2];
		
		// bottom-up
		// for (int i = 1; i <= N; i++) {
		// 	if (i == 1) dp[i][1] = 1;
		// 	else {
		// 		dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
		// 		dp[i][1] = dp[i - 1][0];
		// 	}
		// }

		for (int i = 0; i < 2; i++) {
			topDown(N, i);
		}

		bw.write(String.valueOf(dp[N][0] + dp[N][1]));
		bw.flush();
		bw.close();
	}

	public static long topDown(int N, int i) {
		if (N == 1) {
			if (i == 0) return dp[N][0] = 0;
			else return dp[N][1] = 1;
		}

		if (dp[N][i] == 0) {
			if (i == 0) dp[N][i] = topDown(N - 1, 0) + topDown(N - 1, 1);
			else dp[N][i] = topDown(N - 1, 0);
		}

		return dp[N][i];
	}
}