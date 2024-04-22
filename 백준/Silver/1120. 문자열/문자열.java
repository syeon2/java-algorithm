import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= B.length() - A.length(); i++) {
            int cnt = 0;

            for (int k = 0; k < A.length(); k++) {
                if (A.charAt(k) != B.charAt(i + k)) cnt++;
            }

            ans = Math.min(ans, cnt);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}