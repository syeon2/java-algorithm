import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        boolean[] list = new boolean[21];

        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();

            if (cmd.equals("add")) {
                int num = Integer.parseInt(st.nextToken());

                list[num] = true;
            } else if (cmd.equals("remove")) {
                int num = Integer.parseInt(st.nextToken());

                list[num] = false;
            } else if (cmd.equals("check")) {
                int num = Integer.parseInt(st.nextToken());

                if (list[num]) sb.append(1);
                else sb.append(0);

                sb.append("\n");
            } else if (cmd.equals("toggle")) {
                int num = Integer.parseInt(st.nextToken());

                list[num] = !list[num];
            } else if (cmd.equals("all")) {
                for (int i = 1; i <= 20; i++) {
                    list[i] = true;
                }
            } else {
                for (int i = 1; i <= 20; i++) {
                    list[i] = false;
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}