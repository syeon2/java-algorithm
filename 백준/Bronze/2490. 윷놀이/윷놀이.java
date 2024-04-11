import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str;

        for (int t = 0; t < 3; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int up = 0;
            for (int i = 0; i < 4; i++) {
                if (Integer.parseInt(st.nextToken()) == 1) up++;
            }

            if (up == 0) sb.append("D");
            else if (up == 1) sb.append("C");
            else if (up == 2) sb.append("B");
            else if (up == 3) sb.append("A");
            else sb.append("E");

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}