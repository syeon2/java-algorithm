import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int[][] list;
	static int[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		list = new int[N][3];
		dp = new int[N][3];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int k = 0; k < 3; k++) {
				list[i][k] = Integer.parseInt(st.nextToken());
			}
		}

		// bottom-up
		// for (int i = 0; i < N; i++) {
		// 	if (i == 0) {
		// 		for (int k = 0; k < 3; k++) {
		// 			dp[i][k] = list[i][k];
		// 		}
		// 	} else {
		// 		dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + list[i][0];
		// 		dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + list[i][1];
		// 		dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + list[i][2];
		// 	}
		// }

		for (int i = 0; i < 3; i++) {
			topDown(N - 1, i);
		}

		int answer = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			answer = Math.min(answer, dp[N - 1][i]);
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

	public static int topDown(int n, int i) {
		if (n == 0) return dp[n][i] = list[n][i];

		if (dp[n][i] == 0) {
			if (i == 0) dp[n][i] = Math.min(topDown(n - 1, 1), topDown(n - 1, 2)) + list[n][i];
			else if (i == 1) dp[n][i] = Math.min(topDown(n - 1, 0), topDown(n - 1, 2)) + list[n][i];
			else if (i == 2) dp[n][i] = Math.min(topDown(n - 1, 0), topDown(n - 1, 1)) + list[n][i];
		}

		return dp[n][i];
	}
}