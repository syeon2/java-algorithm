import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    static int[] nList;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        nList = new int[N + 1];
        dp = new int[N + 1][N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            nList[i] = Integer.parseInt(st.nextToken());
        }

        // bottom-up
        for (int k = 0; k < N; k++) {

            for (int n = 1; k + n <= N; n++) {
                if (k == 0) dp[n][n + k] = 1;
                else if (k == 1) {
                    if (nList[n] == nList[n + k]) dp[n][n + k] = 1;
                    else dp[n][n + k] = 0;
                } else {
                    if (dp[n + 1][n + k - 1] == 1 && nList[n] == nList[n + k]) {
                        dp[n][n + k] = 1;
                    } else {
                        dp[n][n + k] = 0;
                    }
                }
            }
        }

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine(), " ");
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            sb.append(String.valueOf(dp[S][E])).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}