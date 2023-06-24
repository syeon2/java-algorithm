import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static int[] list;
	static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		list = new int[N + 1];
		dp = new int[N + 1];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		// 점화식
		// D[N] = max(D[I] + list[N]), I > 0, I < N

		// bottom-up
		for (int i = 1; i <= N; i++) {

			dp[i] = list[i];

			for (int k = 1; k < i; k++) {
				if (list[i] > list[k]) {
					dp[i] = Math.max(dp[i], dp[k] + list[i]);
				}
			}
		}

		int answer = 0;
		for (int i = 1; i <= N; i++) {
			answer = Math.max(answer, dp[i]);
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }
}
