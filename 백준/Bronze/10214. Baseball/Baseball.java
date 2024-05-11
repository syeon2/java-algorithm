import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int y = 0;
            int k = 0;

            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int yScore = Integer.parseInt(st.nextToken());
                int kScore = Integer.parseInt(st.nextToken());

                y += yScore;
                k += kScore;
            }

            if (y > k) sb.append("Yonsei");
            else if (y < k) sb.append("Korea");
            else sb.append("Draw");

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}