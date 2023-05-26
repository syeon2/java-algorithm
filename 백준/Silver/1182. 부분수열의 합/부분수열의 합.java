import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    static int[] nList;
    static boolean[] check;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        check = new boolean[N + 1];
        nList = new int[N + 1];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            nList[i] = Integer.parseInt(st.nextToken());
        }

        getAnswer(1, N, S);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int idx, int n, int s) {
        if (idx == n + 1) {
            boolean flag = false;
            int temp = 0;
            for (int i = 1; i <= n; i++) {
                if (check[i]) {
                    flag = true;
                    temp += nList[i];
                }
            }

            if (!flag) return;

            if (temp == s) {
                answer++;
            }
            return;
        }

        getAnswer(idx + 1, n, s);
        check[idx] = true;
        getAnswer(idx + 1, n, s);
        check[idx] = false;
    }
}