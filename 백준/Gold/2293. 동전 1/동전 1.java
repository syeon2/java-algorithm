import java.io.*;
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

		// bottom-up
		dp[0][0] = 1;
		for (int i = 1; i <= N; i++) {
			for (int k = 0; k <= K; k++) {
				if (i == 1 && k % nList[i] == 0) dp[i][k] = 1;

				else if (nList[i] <= k) dp[i][k] = dp[i - 1][k] + dp[i][k - nList[i]];
				else if (nList[i] > k) dp[i][k] = dp[i - 1][k];
			}
		}

		bw.write(String.valueOf(dp[N][K]));
		bw.flush();
		bw.close();
	}
}