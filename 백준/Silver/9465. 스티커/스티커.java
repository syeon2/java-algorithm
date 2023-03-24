import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int[][] list;
	static int[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());

			list = new int[N + 1][2];
			dp = new int[N + 1][2];

			StringTokenizer st1 = new StringTokenizer(br.readLine());
			StringTokenizer st2 = new StringTokenizer(br.readLine());

			for (int i = 1; i <= N; i++) {
				list[i][0] = Integer.parseInt(st1.nextToken());
				list[i][1] = Integer.parseInt(st2.nextToken());
				dp[i][0] = dp[i][1] = -1;
			}

			// bottom-up
			// for (int i = 1; i <= N; i++) {
			// 	if (i == 1) {
			// 		dp[i][0] = list[i][0];
			// 		dp[i][1] = list[i][1];
			// 	} else {
			// 		dp[i][0] = Math.max(dp[i - 1][1], Math.max(dp[i - 2][0], dp[i - 2][1])) + list[i][0];
			// 		dp[i][1] = Math.max(dp[i - 1][0], Math.max(dp[i - 2][0], dp[i - 2][1])) + list[i][1];
			// 	}
			// }

			for (int i = 1; i <= N; i++) {
				for (int k = 0; k < 2; k++) {
					topDown(i, k);
				}
			}

			int answer = 0;
			for (int i = 1; i <= N; i++) {
				for (int k = 0; k < 2; k++) {
					answer = Math.max(answer, dp[i][k]);
				}
			}

			sb.append(answer).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	public static int topDown(int n, int i) {
		if (n <= 1) dp[n][i] = list[n][i];

		if (dp[n][i] == -1) {
			if (i == 0) dp[n][i] = Math.max(topDown(n - 1, 1),
				Math.max(topDown(n - 2, 0), topDown(n - 2, 1))) + list[n][i];
			else if (i == 1) dp[n][i] = Math.max(topDown(n - 1, 0),
				Math.max(topDown(n - 2, 0), topDown(n - 2, 1))) + list[n][i];
		}

		return dp[n][i];
	}
}