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

        getAnswer(0, N, 0);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int idx, int n, int count) {
        if (count == n / 2) {
            int teamA = 0;
            int teamB = 0;

            for (int i = 0; i < n - 1; i++) {
                for (int k = i + 1; k < n; k++) {
                    if (check[i] && check[k]) {
                        teamA += list[i][k];
                        teamA += list[k][i];
                    }
                    else if (!check[i] && !check[k]) {
                        teamB += list[i][k];
                        teamB += list[k][i];
                    }
                }
            }

            answer = Math.min(answer, Math.abs(teamA - teamB));
            return;
        }

        for (int i = idx; i < n; i++) {
            if (check[i]) continue;

            check[idx] = true;
            getAnswer(i + 1, n, count + 1);
            check[idx] = false;
        }
    }
}