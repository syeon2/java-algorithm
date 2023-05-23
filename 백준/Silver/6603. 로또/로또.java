import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    static int[] list;
    static int[] pos;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());

            if (N == 0) break;

            list = new int[N];
            pos = new int[6];
            check = new boolean[N];

            for (int i = 0; i < N; i++) {
                list[i] = Integer.parseInt(st.nextToken());
            }

            printList(0, N, 0);

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void printList(int idx, int n, int m) {
        if (idx == 6) {
            for (int i = 0; i < 6; i++) {
                sb.append(pos[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = m; i < n; i++) {
            if (check[i]) continue;

            check[i] = true;
            pos[idx] = list[i];
            printList(idx + 1, n, i + 1);
            check[i] = false;
        }
    }
}