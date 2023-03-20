import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int[] list;
	static int[] dp;
	static int[] bt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		list = new int[N];
		dp = new int[N];
		bt = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		// bottom-up
		for (int i = 0; i < N; i++) {
			dp[i] = 1;
			bt[i] = -1;

			for (int k = 0; k < i; k++) {
				if (list[i] > list[k] && dp[i] < dp[k] + 1) {
					dp[i] = dp[k] + 1;
					bt[i] = k;
				}
			}
		}

		// topDown(N - 1);

		int answer = 0;
		int idx = 0;
		for (int i = 0; i < N; i++) {
			if (answer < dp[i]) {
				answer = dp[i];
				idx = i;
			}
		}

		sb.append(answer).append("\n");
		backTracking(idx, sb);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	public static int topDown(int N) {
		if (N == 0) return dp[N] = 1;

		if (dp[N] == 0) {
			dp[N] = 1;

			for (int i = 0; i < N; i++) {
				if (list[N] > list[i] && dp[N] < topDown(i) + 1) {
					dp[N] = topDown(i) + 1;
					bt[N] = i;
				}
			}
		}

		return dp[N];
	}

	public static void backTracking(int i, StringBuilder sb) {
		if (bt[i] == -1) {
			sb.append(list[i]).append(" ");
			return;
		}

		backTracking(bt[i], sb);

		sb.append(list[i]).append(" ");
	}
}