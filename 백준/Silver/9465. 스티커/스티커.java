import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static int[][] nList;
	static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			nList = new int[N + 1][2];
			dp = new int[N + 1][2];

			for (int i = 0; i < 2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");

				for (int k = 1; k <= N; k++) {
					nList[k][i] = Integer.parseInt(st.nextToken());
					dp[k][i] = -1;
				}
			}

			// // bottom-up
			dp[1][0] = nList[1][0];
			dp[1][1] = nList[1][1];

			for (int i = 2; i <= N; i++) {
				dp[i][0] = Math.max(dp[i - 1][1],
					Math.max(dp[i - 2][0], dp[i - 2][1])) + nList[i][0];

				dp[i][1] = Math.max(dp[i - 1][0],
					Math.max(dp[i - 2][0], dp[i - 2][1])) + nList[i][1];
			}

			// topDown(N, 0);
			// topDown(N, 1);

			int answer = 0;
			for (int i = 1; i <= N; i++) {
				answer = Math.max(answer,
					Math.max(dp[i][0], dp[i][1]));
			}

			sb.append(answer).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }

	public static int topDown(int n, int i) {
		if (n == 1) return dp[n][i] = nList[n][i];

		if (dp[n][i] == -1) {
			if (i == 0) {
				dp[n][i] = Math.max(topDown(n - 1, 1),
					Math.max(topDown(n - 2, 0), topDown(n - 2, 1))) + nList[n][i];
			} else {
				dp[n][i] = Math.max(topDown(n - 1, 0),
					Math.max(topDown(n - 2, 0), topDown(n - 2, 1))) + nList[n][i];
			}
		}

		return dp[n][i];
	}
}