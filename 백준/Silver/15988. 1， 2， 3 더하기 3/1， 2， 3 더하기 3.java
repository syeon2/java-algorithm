import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

	static long[] dp = new long[1_000_001];
	static long MOD = 1_000_000_009;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;

		for (int i = 4; i < 1000001; i++) {
			dp[i] = (dp[i - 3] + dp[i - 2] + dp[i - 1]) % MOD;
		}

		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());

			sb.append(dp[N]).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }

	public static long topDown(int n) {
		if (n == 1) dp[n] = 1;
		else if (n == 2) dp[n] = 2;
		else if (n == 3) dp[n] = 4;

		if (dp[n] == 0) {
			dp[n] = (topDown(n - 3) + topDown(n - 2) + topDown(n - 1)) % MOD;
		}

		return dp[n];
	}
}