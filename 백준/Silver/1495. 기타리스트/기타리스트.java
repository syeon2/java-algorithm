import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int[] list;
	static boolean[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		list = new int[N + 1];
		dp = new boolean[N + 1][M + 1];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		// bottom-up
		dp[0][S] = true;
		for (int n = 1; n <= N; n++) {
			for (int m = 0; m <= M; m++) {
				if (dp[n - 1][m]) {
					if (m + list[n] <= M) dp[n][m + list[n]] = true;
					if (m - list[n] >= 0) dp[n][m - list[n]] = true;
				}
			}
		}

		int answer = -1;
		for (int i = 0; i <= M; i++) {
			if (dp[N][i]) answer = Math.max(answer, i);
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}
}