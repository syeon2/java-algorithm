import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    static int[] pos;
    static boolean[] check = new boolean[10];
    static long maxNum;
    static long minNum;
    static String[] charList;

    static String maxAnswer = "";
    static String minAnswer = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        pos = new int[N + 1];
        charList = new String[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            charList[i] = st.nextToken();
        }

        getAnswer(0, N);

        bw.write(maxAnswer);
        bw.newLine();
        bw.write(minAnswer);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int idx, int n) {
        if (idx == n + 1) {
            for (int i = 0; i < n; i++) {
                if (charList[i].equals(">")) {
                    if (pos[i] < pos[i + 1]) return;
                } else {
                    if (pos[i] > pos[i + 1]) return;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n + 1; i++) {
                sb.append(pos[i]);
            }

            long temp = Long.parseLong(sb.toString());

            if (maxNum < temp) {
                maxNum = temp;
                maxAnswer = sb.toString();
            } else if (maxNum == 0) {
                maxNum = temp;
                maxAnswer = sb.toString();
            }

            if (minNum > temp) {
                minNum = temp;
                minAnswer = sb.toString();
            } else if (minNum == 0) {
                minNum = temp;
                minAnswer = sb.toString();
            }

            return;
        }

        for (int i = 0; i < 10; i++) {
            if (check[i]) continue;

            check[i] = true;
            pos[idx] = i;
            getAnswer(idx + 1, n);
            check[i] = false;
        }
    }
}