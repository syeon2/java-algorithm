import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int[] list;
	static Integer[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		list = new int[N + 1];
		dp = new Integer[N + 1];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int n = 1; n <= N; n++) {
			list[n] = Integer.parseInt(st.nextToken());
			dp[n] = Integer.MAX_VALUE;
		}

		// bottom-up
		// dp[1] = 0;
		// for (int i = 1; i <= N; i++) {
		// 	for (int j = 1; j < i; j++) {
		// 		if (list[j] + j >= i && dp[j] != Integer.MAX_VALUE) dp[i] = Math.min(dp[i], dp[j] + 1);
		// 	}
		// }

		for (int i = 1; i <= N; i++) {
			topDown(i);
		}

		int answer = -1;
		if (dp[N] != Integer.MAX_VALUE) answer = dp[N];

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

	public static int topDown(int n) {
		if (n == 1) return dp[n] = 0;

		if (dp[n] == Integer.MAX_VALUE) {
			for (int i = 1; i < n; i++) {
				if (list[i] + i >= n && dp[i] != Integer.MAX_VALUE) {
					dp[n] = Math.min(dp[n], topDown(i) + 1);
				}
			}
		}

		return dp[n];
	}
}