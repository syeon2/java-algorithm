import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

	static int[] dp = new int[11];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		// for (int i = 1; i <= 10; i++) {
		// 	if (i == 1) dp[i] = 1;
		// 	else if (i == 2) dp[i] = 2;
		// 	else if (i == 3) dp[i] = 4;
		// 	else dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		// }


        int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());

			sb.append(topDown(N)).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }

	public static int topDown(int n) {
		if (n == 1) return dp[n] = 1;
		else if (n == 2) return dp[n] = 2;
		else if (n == 3) return dp[n] = 4;

		if (dp[n] == 0) {
			dp[n] = topDown(n - 1) + topDown(n - 2) + topDown(n - 3);
		}

		return dp[n];
	}
}