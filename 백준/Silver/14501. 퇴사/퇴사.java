import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    static int answer;
    static int[] tList;
    static int[] pList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        tList = new int[N + 1];
        pList = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            tList[i] = Integer.parseInt(st.nextToken());
            pList[i] = Integer.parseInt(st.nextToken());
        }

        getAnswer(N, 1, 0);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    public static void getAnswer(int n, int curTime, int curPay) {
        if (n < curTime) {
            answer = Math.max(answer, curPay);
            return;
        }

        for (int i = curTime; i <= n; i++) {
            int nextTime = i + tList[i];
            int nextPay = curPay + pList[i];

            if (nextTime > n + 1) getAnswer(n, nextTime, curPay);
            else getAnswer(n, nextTime, nextPay);
        }
    }
}