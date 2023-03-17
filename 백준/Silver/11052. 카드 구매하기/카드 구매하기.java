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

		// bottom-up
		// for (int i = 1; i <= N; i++) {
		// 	dp[i] = list[i];
		//
		// 	for (int k = 1; k < i; k++) {
		// 		dp[i] = Math.max(dp[i], dp[k] + list[i - k]);
		// 	}
		// }
		int answer = topDown(N);

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

	public static int topDown(int N) {
		if (N == 1) return dp[N] = list[N];

		if (dp[N] == 0) {
			dp[N] = list[N];

			for (int i = 1; i < N; i++) {
				dp[N] = Math.max(dp[N], topDown(i) + list[N - i]);
			}
		}

		return dp[N];
	}
}