import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] list = new int[N];
		int[] dp = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			dp[i] = 1001;
		}

		// bottom-up
		dp[0] = 0;
		for (int i = 0; i < N; i++) {

			for (int k = 0; k < i; k++) {
				if (k + list[k] >= i) dp[i] = Math.min(dp[i], dp[k] + 1);
			}
		}

		if (dp[N - 1] == 1001) bw.write(String.valueOf(-1));
		else bw.write(String.valueOf(dp[N - 1]));

		bw.flush();
		bw.close();
	}
}