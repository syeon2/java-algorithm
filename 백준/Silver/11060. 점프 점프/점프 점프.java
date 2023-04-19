import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static int[] nList;
	static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
		nList = new int[N + 1];
		dp = new int[N + 1];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= N; i++) {
			nList[i] = Integer.parseInt(st.nextToken());
			dp[i] = 10000;
		}

		// bottom-up
		// dp[1] = 0;
		// for (int i = 1; i <= N; i++) {
		//
		// 	for (int k = 1; k < i; k++) {
		// 		if (k + nList[k] >= i && dp[k] != 10000) dp[i] = Math.min(dp[i], dp[k] + 1);
		// 	}
		// }
		for (int i = 1; i <= N; i++) {
			topDown(i);
		}

		int answer = dp[N];
		if (answer == 10000) answer = -1;

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }

	public static int topDown(int n) {
		if (n == 1) return dp[1] = 0;

		if (dp[n] == 10000 && nList[n] != 0) {
			for (int i = 1; i < n; i++) {
				if (i + nList[i] >= n && dp[i] != 10000) dp[n] = Math.min(dp[n], topDown(i) + 1);
			}
		}

		return dp[n];
	}
}