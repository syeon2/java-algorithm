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

        int N = Integer.parseInt(br.readLine());
		list = new int[N + 1][N + 1];
		dp = new int[N + 1][N + 1];

		for (int i = 1; i <= N; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int k = 1; k <= i; k++) {
				list[i][k] = Integer.parseInt(st.nextToken());
			}
		}

		// 점화식
		// D[N][M] = max(D[N - 1][I - 1], D[N - 1][I]) + A[N][M], I > 0, I <= N

		// bottom-up
		for (int i = 1; i <= N; i++) {

			if (i == 1) dp[i][1] = list[i][1];
			else {
				for (int k = 1; k <= i; k++) {
					if (k == 1) dp[i][k] = dp[i - 1][k] + list[i][k];
					else if (k == i) dp[i][k] = dp[i - 1][k - 1] + list[i][k];
					else dp[i][k] = Math.max(dp[i - 1][k - 1], dp[i - 1][k]) + list[i][k];
				}
			}
		}

		int answer = 0;
		for (int i = 1; i <= N; i++) {
			answer = Math.max(answer, dp[N][i]);
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }
}
