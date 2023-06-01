import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    static int[][] list;
    static boolean[] check;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        list = new int[N + 1][N + 1];
        check = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a][b] = list[b][a] = 1;
        }

        for (int i = 1; i <= N; i++) {
            if (check[i]) continue;
            dfs(N, i);
            answer++;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static void dfs(int n, int v) {
        for (int i = 1; i <= n; i++) {
            if (list[v][i] == 0 || check[i]) continue;

            check[i] = true;
            dfs(n, i);
        }
    }
}