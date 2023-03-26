import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int[] list;
	static int[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		list = new int[N];
		dp = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		// bottom-up
		// for (int i = 0; i < N; i++) {
		// 	dp[i] = 1;
		//
		// 	for (int k = 0; k < i; k++) {
		// 		if (list[i] < list[k]) dp[i] = Math.max(dp[i], dp[k] + 1);
		// 	}
		// }

		for (int i = 0; i < N; i++) {
			topDown(i);
		}

		int answer = 0;
		for (int i = 0; i < N; i++) {
			answer = Math.max(answer, dp[i]);
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

	public static int topDown(int n) {
		if (n == 0) return dp[n] = 1;

		if (dp[n] == 0) {
			dp[n] = 1;

			for (int i = 0; i < n; i++) {
				if (list[n] < list[i]) dp[n] = Math.max(dp[n], topDown(i) + 1);
			}
		}

		return dp[n];
	}
}