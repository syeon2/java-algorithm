import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static int[][] dp;
	static int[] wList;
	static int[] vList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		dp = new int[N + 1][K + 1];
		wList = new int[N + 1];
		vList = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			wList[i] = Integer.parseInt(st.nextToken());
			vList[i] = Integer.parseInt(st.nextToken());
		}

		// bottom-up
		for (int n = 1; n <= N; n++) {

			for (int k = 1; k <= K; k++) {
				if (k >= wList[n]) dp[n][k] = Math.max(dp[n - 1][k], dp[n - 1][k - wList[n]] + vList[n]);
				else dp[n][k] = dp[n - 1][k];
			}
		}

		int answer = dp[N][1];
		for (int i = 1; i <= K; i++) {
			answer = Math.max(answer, dp[N][i]);
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }
}