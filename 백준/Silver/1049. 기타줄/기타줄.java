import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] list = new int[M][2];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            list[i][0] = A;
            list[i][1] = B;
        }

        int ans = Integer.MAX_VALUE;

        int pac = getNeedPac(N);

        for (int i = 0; i <= pac; i++) {
            for (int k = 0; k < list.length; k++) {
                int pacCost = list[k][0] * i;

                if (6 * i >= N) {
                    ans = Math.min(ans, list[k][0] * i);
                    continue;
                }

                for (int j = 0; j < list.length; j++) {
                    int remainCnt = N - (6 * i);
                    int totalCost = pacCost + (remainCnt * list[j][1]);

                    ans = Math.min(ans, totalCost);
                }
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int getNeedPac(int num) {
        int pac = 0;
        pac += num / 6;
        if (num % 6 > 0) pac++;

        return pac;
    }
}