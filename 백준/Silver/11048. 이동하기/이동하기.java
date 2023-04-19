import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static int[][] board;
	static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		board = new int[N + 1][M + 1];
		dp = new int[N + 1][M + 1];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			for (int k = 1; k <= M; k++) {
				board[i][k] = Integer.parseInt(st.nextToken());
				dp[i][k] = -1;
			}
		}

		// bottom-up
		// for (int i = 1; i <= N; i++) {
		//
		// 	for (int k = 1; k <= M; k++) {
		// 		dp[i][k] = Math.max(dp[i - 1][k],
		// 			Math.max(dp[i][k - 1], dp[i - 1][k - 1])) + board[i][k];
		// 	}
		// }

		int answer = topDown(N, M);

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }

	public static int topDown(int n, int m) {
		if (n == 0 || m == 0) return dp[n][m] = board[n][m];

		if (dp[n][m] == -1) {
			dp[n][m] = Math.max(topDown(n - 1, m),
				Math.max(topDown(n, m - 1), topDown(n - 1, m - 1))) + board[n][m];
		}

		return dp[n][m];
	}
}