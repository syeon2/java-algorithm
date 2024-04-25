import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        boolean flag = true;
        for (int n = n0; n <= 100; n++) {
            if ((a1 * n) + a0 <= n * c) continue;
            else flag = false;
        }

        if (flag) bw.write("1");
        else bw.write("0");

        bw.flush();
        bw.close();
    }
}