import java.io.*;

public class Main {

	static int[] list;
	static int[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		list = new int[N + 1];
		dp = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			list[i] = Integer.parseInt(br.readLine());
			dp[i] = -1;
		}

		// bottom-up
		dp[1] = list[1];
		if (N > 1) dp[2] = list[1] + list[2];

		for (int i = 3; i <= N; i++) {
			dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2], dp[i - 3] + list[i - 1]) + list[i]);
		}

		// topDown(N);

		int answer = 0;
		for (int i = 1; i <= N; i++) {
			answer = Math.max(answer, dp[i]);
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

	public static int topDown(int n) {
		if (n == 1) dp[n] = list[n];
		else if (n == 2) dp[n] = list[1] + list[2];

		if (dp[n] == -1) {
			dp[n] = Math.max(topDown(n - 1),
				Math.max(topDown(n - 2), topDown(n - 3) + list[n - 1]) + list[n]);
		}

		return dp[n];
	}
}