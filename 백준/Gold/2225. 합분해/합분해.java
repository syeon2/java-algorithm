import java.io.*;
import java.util.Arrays;
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

		// Arrays.fill(dp[1], 1);

		// for (int k = 2; k <= K; k++) {
		// 	for (int n = 0; n <= N; n++) {
		// 		if (n == 0) dp[k][n] = 1;
		// 		else {
		// 			dp[k][n] = (dp[k - 1][n] + dp[k][n - 1]) % MOD;
		// 		}
		// 	}
		// }

		int answer = topDown(N, K);

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

	public static int topDown(int N, int K) {
		if (K == 1 || N == 0) return dp[K][N] = 1;

		if (dp[K][N] == 0) {
			dp[K][N] = (topDown(N - 1, K) + topDown(N, K - 1)) % MOD;
		}

		return dp[K][N];
	}
}