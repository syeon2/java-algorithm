import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[][] board = new int[N + 1][N + 1];
            boolean[] visited = new boolean[N + 1];

            for (int m = 0; m < M; m++) {
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                board[a][b] = 1;
                board[b][a] = 1;
            }

            int ans = 0;
            visited[1] = true;
            for (int i = 1; i <= N; i++) {
                for (int k = 1; k <= N; k++) {
                    if (visited[k]) continue;

                    if (board[i][k] == 1) {
                        visited[k] = true;
                        ans++;
                    }
                }
            }

            sb.append(ans).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}