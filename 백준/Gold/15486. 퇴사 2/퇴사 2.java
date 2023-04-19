import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static int[] T;
	static int[] P;
	static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
		T = new int[N + 51];
		P = new int[N + 51];
		dp = new int[N + 51];

		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
		}

		// bottom-up
		for (int i = 1; i <= N + 1; i++) {
			dp[i] = Math.max(dp[i], dp[i - 1]);
			dp[i + T[i]] = Math.max(dp[i] + P[i], dp[i + T[i]]);
		}

		bw.write(String.valueOf(dp[N + 1]));
		bw.flush();
		bw.close();
    }
}