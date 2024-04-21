import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            Integer[] list = new Integer[10];
            for (int i = 0; i < 10; i++) {
                list[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(list, Collections.reverseOrder());

            sb.append(list[2]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}