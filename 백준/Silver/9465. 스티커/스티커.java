import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
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

			list = new int[2][N + 1];
			dp = new int[3][N + 1];

			for (int i = 0; i < 2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");

				for (int k = 1; k <= N; k++) {
					list[i][k] = Integer.parseInt(st.nextToken());
				}
			}

			// bottom-up
			dp[0][1] = list[0][1];
			dp[1][1] = list[1][1];

			for (int i = 2; i <= N; i++) {
				dp[0][i] = Math.max(dp[1][i - 1], dp[2][i - 1]) + list[0][i];
				dp[1][i] = Math.max(dp[0][i - 1], dp[2][i - 1]) + list[1][i];
				dp[2][i] = Math.max(dp[0][i - 1], Math.max(dp[1][i - 1], dp[2][i - 1]));
			}

			int answer = 0;
			for (int i = 0; i < 3; i++) {
				answer = Math.max(answer, dp[i][N]);
			}

			sb.append(answer).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
