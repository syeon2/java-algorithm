import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int[] nList;
	static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
		nList = new int[N + 1];
		dp = new long[N + 1][21];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= N; i++) {
			nList[i] = Integer.parseInt(st.nextToken());
		}

		// bottom-up
		dp[1][nList[1]] = 1;
		for (int i = 2; i < N; i++) {

			for (int k = 0; k <= 20; k++) {
				if (dp[i - 1][k] != 0) {
					if (k + nList[i] <= 20) dp[i][k + nList[i]] += dp[i - 1][k];
					if (k - nList[i] >= 0) dp[i][k - nList[i]] += dp[i - 1][k];
				}
			}
		}

		bw.write(String.valueOf(dp[N - 1][nList[N]]));
		bw.flush();
		bw.close();
    }
}