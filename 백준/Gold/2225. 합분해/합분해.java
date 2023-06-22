import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static int[][] dp;
	static int MOD = 1_000_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		dp = new int[K + 1][N + 1];

		dp[0][0] = 1;
		for (int i = 1; i <= N; i++) {
			dp[1][i] = 1;
		}

		// bottom-up
		for (int k = 2; k <= K; k++) {

			for (int n = 0; n <= N; n++) {
				if (n == 0) dp[k][n] = 1;
				else dp[k][n] = (dp[k - 1][n] + dp[k][n - 1]) % MOD;
			}
		}

		bw.write(String.valueOf(dp[K][N]));
		bw.flush();
		bw.close();
    }
}
