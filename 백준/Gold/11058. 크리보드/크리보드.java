import java.io.*;

public class Main {

	static long[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		dp = new long[N + 1];

		// bottom-up
		for (int i = 1; i <= N; i++) {
			dp[i] = i;

			for (int k = 3; k <= i; k++) {
				dp[i] = Math.max(dp[i], dp[i - k] * (k - 1));
			}
		}

		bw.write(String.valueOf(dp[N]));
		bw.flush();
		bw.close();
	}
}