import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	static char[] cList;
	static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

		cList = new char[N + 1];
		dp = new int[N + 1];

		char[] block = br.readLine().toCharArray();
		for (int i = 1; i <= N; i++) {
			cList[i] = block[i - 1];
			dp[i] = Integer.MAX_VALUE;
		}

		// bottom-up
		dp[1] = 0;
		for (int i = 1; i <= N; i++) {

			for (int k = 1; k < i; k++) {
				if (cList[i] == 'B' && cList[k] == 'J' && dp[k] != Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i], dp[k] + (i - k) * (i - k));
				} else if (cList[i] == 'O' && cList[k] == 'B' && dp[k] != Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i], dp[k] + (i - k) * (i - k));
				} else if (cList[i] == 'J' && cList[k] == 'O' && dp[k] != Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i], dp[k] + (i - k) * (i - k));
				}
			}
		}

		int answer = dp[N];
		if (answer == Integer.MAX_VALUE) answer = -1;

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }
}