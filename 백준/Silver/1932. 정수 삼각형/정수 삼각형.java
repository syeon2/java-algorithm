import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int[][] list;
	static int[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		list = new int[N + 1][N + 1];
		dp = new int[N + 1][N + 1];

		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int k = 1; k <= i; k++) {
				list[i][k] = Integer.parseInt(st.nextToken());
				dp[i][k] = -1;
			}
		}

		// bottom-up
		// dp[1][1] = list[1][1];
		// for (int i = 2; i <= N; i++) {
		//
		// 	for (int k = 1; k <= i; k++) {
		// 		if (k == 1) dp[i][k] = dp[i - 1][k] + list[i][k];
		// 		else if (k == i) dp[i][k] = dp[i - 1][k - 1] + list[i][k];
		// 		else {
		// 			dp[i][k] = Math.max(dp[i - 1][k - 1], dp[i - 1][k]) + list[i][k];
		// 		}
		// 	}
		// }

		for (int k = 1; k <= N; k++) {
			topDown(N, k);
		}

		int answer = 0;
		for (int i = 1; i <= N; i++) {
			answer = Math.max(answer, dp[N][i]);
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

	public static int topDown(int n, int i) {
		if (n == 1) return dp[n][i] = list[n][i];

		if (dp[n][i] == -1) {
			if (i == 1) dp[n][i] = topDown(n - 1, i) + list[n][i];
			else if (i == n) dp[n][i] = topDown(n - 1, i - 1) + list[n][i];
			else {
				dp[n][i] = Math.max(topDown(n - 1, i - 1), topDown(n - 1, i)) + list[n][i];
			}
		}

		return dp[n][i];
	}
}