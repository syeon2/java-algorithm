import java.io.*;

public class Main {

	static int[] dp = new int[1000001];
	static int MOD = 1_000_000_009;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		// bottom-up
		for (int i = 1; i <= 1000000; i++) {
			if (i == 1) dp[i] = 1;
			else if (i == 2) dp[i] = 2;
			else if (i == 3) dp[i] = 4;
			else {
				int temp = 0;
				for (int k = 1; k <= 3; k++) {
					temp += dp[i - k];
					temp %= MOD;
				}

				dp[i] = temp;
			}
		}

		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());

			// top-down
			// topDown(N);

			sb.append(dp[N]).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	public static int topDown(int N) {
		if (N == 1) return dp[N] = 1;
		else if (N == 2) return dp[N] = 2;
		else if (N == 3) return dp[N] = 4;

		if (dp[N] == 0) {
			int temp = 0;
			for (int i = 1; i <= 3; i++) {
				temp = topDown(N - i);
				temp %= MOD;
			}
			dp[N] = temp;
		}

		return dp[N];
	}
}