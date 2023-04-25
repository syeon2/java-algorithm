import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int[][] dp;
	static int[] sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			dp = new int[N + 1][N + 1];
			sum = new int[N + 1];

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 1; i <= N; i++) {
				int K = Integer.parseInt(st.nextToken());
				sum[i] = sum[i - 1] + K;
			}

			for (int distance = 1; distance <= N; distance++) {

				for (int from = 1; from + distance <= N; from++) {
					int to = from + distance;

					dp[from][to] = Integer.MAX_VALUE;
					for (int divide = from; divide < to; divide++) {
						dp[from][to] = Math.min(dp[from][to],
							dp[from][divide] + dp[divide + 1][to] + sum[to] - sum[from - 1]);
					}
				}
			}

			sb.append(dp[1][N]).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}