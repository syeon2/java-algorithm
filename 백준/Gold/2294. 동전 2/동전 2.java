import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int[] nList;
	static int[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		nList = new int[N + 1];
		dp = new int[N + 1][K + 1];

		for (int i = 1; i <= N; i++) {
			nList[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i <= N; i++) {
			Arrays.fill(dp[i], 100_001);
		}

		// bottom-up
		dp[0][0] = 1;
		for (int i = 1; i <= N; i++) {
			dp[i][0] = 0;

			for (int k = 1; k <= K; k++) {
				if (nList[i] > k) dp[i][k] = dp[i - 1][k];
				else if (nList[i] <= k) dp[i][k] = Math.min(dp[i - 1][k], dp[i][k - nList[i]] + 1);
			}
		}

		int answer = -1;
		if (dp[N][K] != 100_001) answer = dp[N][K];

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}
}