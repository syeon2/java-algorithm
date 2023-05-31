import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] list;
    static boolean[] check;
    static Queue<Integer> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        list = new int[N + 1][N + 1];
        check = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a][b] = list[b][a] = 1;
        }

        queue.add(V);
        check[V] = true;
        dfs(N, V);
        sb.append("\n");

        check = new boolean[N + 1];
        check[V] = true;
        bfs(N, V);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void dfs(int n, int v) {
        sb.append(v).append(" ");

        for (int i = 1; i <= n; i++) {
            if (list[v][i] == 0 || check[i]) continue;

            check[i] = true;
            dfs(n, i);
        }
    }

    private static void bfs(int n, int v) {
        for (int i = 1; i <= n; i++) {
            if (list[v][i] == 0 || check[i]) continue;

            check[i] = true;
            queue.add(i);
        }

        for (int i = 0; i < queue.size(); i++) {
            Integer head = queue.poll();
            sb.append(head).append(" ");
            bfs(n, head);
        }
    }
}