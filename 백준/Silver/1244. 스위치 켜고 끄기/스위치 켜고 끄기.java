import java.io.*;
import java.util.*;

public class Main {

    public static int N;
    public static int[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        list = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());

            int gender = Integer.parseInt(st.nextToken());
            int card = Integer.parseInt(st.nextToken());

            turnSwitch(gender, card);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(list[i]).append(" ");
            
            if (i % 20 == 0) sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void turnSwitch(int gender, int card) {
        if (gender == 1) {
            for (int i = 1; i <= N; i++) {
                if (i % card == 0) {
                    if (list[i] == 1) list[i] = 0;
                    else list[i] = 1;
                }
            }
        } else {
            int start = card - 1;
            int end = card + 1;

            if (list[card] == 1) list[card] = 0;
            else list[card] = 1;

            while (start >= 1 && end <= N) {
                if (list[start] == list[end]) {
                    if (list[start] == 0) {
                        list[start] = 1;
                        list[end] = 1;
                    } else {
                        list[start] = 0;
                        list[end] = 0;
                    }

                    start -= 1;
                    end += 1;
                } else break;
            }
        }
    }
}