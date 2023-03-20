import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int[] list;
	static Integer[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		list = new int[N];
		dp = new Integer[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		// bottom-up
		// for (int i = 0; i < N; i++) {
		// 	if (i == 0) dp[i] = list[i];
		// 	else {
		// 		dp[i] = Math.max(list[i], dp[i - 1] + list[i]);
		// 	}
		// }

		topDown(N - 1);

		int answer = dp[0];
		for (int i = 0; i < N; i++) {
			answer = Math.max(answer, dp[i]);
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

	public static int topDown(int N) {
		if (N == 0) return dp[N] = list[N];

		if (dp[N] == null) {
			dp[N] = Math.max(list[N], topDown(N - 1) + list[N]);
		}

		return dp[N];
	}
}