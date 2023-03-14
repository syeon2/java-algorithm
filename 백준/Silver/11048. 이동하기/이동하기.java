import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int[][] list;
	static int[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int[][] list = new int[M][N];
		int[][] dp = new int[M][N];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			for (int k = 0; k < N; k++) {
				list[i][k] = Integer.parseInt(st.nextToken());
				dp[i][k] = -1;
			}
		}

		// bottom-up
		dp[0][0] = list[0][0];
		for (int i = 0; i < M; i++) {

			for (int k = 0; k < N; k++) {
				if (i == 0 && k == 0) continue;
				else if (i == 0) dp[i][k] = dp[i][k - 1] + list[i][k];
				else if (k == 0) dp[i][k] = dp[i - 1][k] + list[i][k];
				else {
					dp[i][k] = Math.max(dp[i - 1][k], Math.max(dp[i][k - 1], dp[i - 1][k - 1])) + list[i][k];
				}
			}
		}

		bw.write(String.valueOf(dp[M - 1][N - 1]));
		bw.flush();
		bw.close();
	}
}