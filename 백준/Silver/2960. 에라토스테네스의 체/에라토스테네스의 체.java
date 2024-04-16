import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] era = new boolean[N + 1];

        for (int i = 2; i <= N; i++) {

            if (!era[i]) {
                for (int k = i; k <= N; k += i) {
                    if (!era[k]) {
                        era[k] = true;
                        K--;
                    }

                    if (K == 0) {
                        bw.write(String.valueOf(k));
                        break;
                    }
                }
            }

            if (K == 0) break;
        }

        bw.flush();
        bw.close();
    }
}