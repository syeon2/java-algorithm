import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int[][] board;
	static long[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		board = new int[N + 1][N + 1];
		dp = new long[N + 1][N + 1];

		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			for (int k = 1; k <= N; k++) {
				board[i][k] = Integer.parseInt(st.nextToken());
			}
		}

		// bottom-up
		dp[1][1] = 1;
		for (int i = 1; i <= N; i++) {
			for (int k = 1; k <= N; k++) {
				if (board[i][k] == 0) continue;

				if (i + board[i][k] <= N) dp[i + board[i][k]][k] += dp[i][k];
				if (k + board[i][k] <= N) dp[i][k + board[i][k]] += dp[i][k];
			}
		}

		bw.write(String.valueOf(dp[N][N]));
		bw.flush();
		bw.close();
	}
}