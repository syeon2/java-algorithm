import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static int[] list;
	static int[] dp;
	static int[] tracking;
	static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
		list = new int[N + 1];
		dp = new int[N + 1];
		tracking = new int[N + 1];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		// 점화식
		// D[N] = D[I] + 1, I > 0, I < N, A[N] > A[I]

		// bottom-up
		// for (int i = 1; i <= N; i++) {
		//
		// 	dp[i] = 1;
		// 	for (int k = 1; k < i; k++) {
		// 		if (list[i] > list[k] && dp[i] < dp[k] + 1) {
		// 			dp[i] = dp[k] + 1;
		// 			tracking[i] = k;
		// 		}
		// 	}
		// }

		for (int i = 1; i <= N; i++) {
			topDown(i);
		}


		int answer = 0;
		int idx = 0;
		for (int i = 1; i <= N; i++) {
			if (answer < dp[i]) {
				answer = dp[i];
				idx = i;
			}
		}

		sb.append(String.valueOf(answer)).append("\n");
		backtracking(idx);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }

	public static int topDown(int n) {
		if (n == 1) return dp[n] = 1;

		if (dp[n] == 0) {
			dp[n] = 1;

			for (int i = 1; i < n; i++) {
				if (list[n] > list[i] && dp[n] < topDown(i) + 1) {
					dp[n] = topDown(i) + 1;

					tracking[n] = i;
				}
			}
		}

		return dp[n];
	}

	public static void backtracking(int n) {
		if (tracking[n] == 0) {
			sb.append(list[n]).append(" ");
			return;
		}

		backtracking(tracking[n]);

		sb.append(list[n]).append(" ");
	}
}
