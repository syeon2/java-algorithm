import java.io.*;

public class Main {

	static int[] dp;
	static int MOD = 10_007;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		dp = new int[N + 1];

		// bottom-up
		for (int i = 1; i <= N; i++) {
			if (i == 1) dp[1] = 1;
			else if (i == 2) dp[2] = 2;
			else dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
		}

		// int answer = topDown(N);

		bw.write(String.valueOf(dp[N]));
		bw.flush();
		bw.close();
	}

	public static int topDown(int N) {
		if (N < 3) return dp[N] = N;

		if (dp[N] == 0) {
			dp[N] = (topDown(N - 1) + topDown(N - 2)) % MOD;
		}

		return dp[N];
	}
}