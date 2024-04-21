import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean cont = false;
        int prefix = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num == 1 && !cont) {
                cont = true;
                prefix++;
                sum += prefix;
            } else if (num == 1 && cont) {
                prefix++;
                sum += prefix;
            } else {
                cont = false;
                prefix = 0;
            }
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}