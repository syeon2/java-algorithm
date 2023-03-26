import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int[] list;
	static int[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		list = new int[N + 1];
		dp = new int[N + 1];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		//
		// for (int i = 1; i <= N; i++) {
		// 	dp[i] = list[i];
		//
		// 	for (int k = 1; k < i; k++) {
		// 		if (list[i] > list[k]) dp[i] = Math.max(dp[i], dp[k] + list[i]);
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
		if (n == 1) return dp[n] = list[n];

		if (dp[n] == 0) {
			dp[n] = list[n];

			for (int i = 1; i < n; i++) {
				if (list[n] > list[i]) dp[n] = Math.max(dp[n], topDown(i) + list[n]);
			}
		}

		return dp[n];
	}
}