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
		}

		// bottom-up
		// for (int i = 1; i <= N; i++) {
		// 	dp[i] = nList[i];
		//
		// 	for (int k = 1; k < i; k++) {
		// 		if (nList[i] > nList[k]) dp[i] = Math.max(dp[i], dp[k] + nList[i]);
		// 	}
		// }

		for (int i = 1; i <= N; i++) {
			topDown(i);
		}

		int answer = 0;
		for (int i = 1; i <= N; i++) {
			answer = Math.max(answer, dp[i]);
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }

	public static int topDown(int n) {
		if (n == 1) return dp[n] = nList[n];

		if (dp[n] == 0) {
			dp[n] = nList[n];

			for (int i = 1; i < n; i++) {
				if (nList[n] > nList[i]) dp[n] = Math.max(dp[n], topDown(i) + nList[n]);
			}
		}

		return dp[n];
	}
}