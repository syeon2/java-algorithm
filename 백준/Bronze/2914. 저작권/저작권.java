import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int ans = 1;

        while (true) {
            int remain = ans % A;

            if (remain > 0 && A * (B - 1) + 1 == ans) break;
            else if (remain == 0 && A * B == ans) break;
            else ans++;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}