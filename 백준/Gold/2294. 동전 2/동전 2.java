import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
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

		Arrays.fill(dp[0], 100001);
		dp[0][0] = 0;

		for (int n = 1; n <= N; n++) {

			for (int k = 0; k <= K; k++) {
				dp[n][k] = dp[n - 1][k];

				if (k - nList[n] >= 0) dp[n][k] = Math.min(dp[n][k], dp[n][k - nList[n]] + 1);
			}
		}

		int answer = dp[N][K];
		if (answer == 100001) answer = -1;
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }
}