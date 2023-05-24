import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    static int[][] list;
    static boolean[] check;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        list = new int[N][N];
        check = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int k = 0; k < N; k++) {
                list[i][k] = Integer.parseInt(st.nextToken());
            }
        }

        getAnswer(0, N);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int idx, int n) {
        if (idx == n) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (check[i]) count++;
            }

            if (count != n / 2) return;

            int teamA = 0;
            int teamB = 0;

            for (int i = 0; i < n; i++) {

                if (check[i]) continue;
                for (int k = 0; k < n; k++) {
                    if (i == k || check[k]) continue;

                    teamA += list[i][k];
                }
            }

            for (int i = 0; i < n; i++) {

                if (!check[i]) continue;
                for (int k = 0; k < n; k++) {
                    if (i == k || !check[k]) continue;

                    teamB += list[i][k];
                }
            }

            answer = Math.min(answer, Math.abs(teamA - teamB));
            return;
        }

        getAnswer(idx + 1, n);
        check[idx] = true;
        getAnswer(idx + 1, n);
        check[idx] = false;
    }
}