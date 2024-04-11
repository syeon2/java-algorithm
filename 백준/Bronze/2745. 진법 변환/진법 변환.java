import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int ans = 0;
        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);

            if (c >= '0' && c <= '9') {
                ans = (ans * B) + (c - '0');
            } else {
                ans = (ans * B) + (10 + (c - 'A'));
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}