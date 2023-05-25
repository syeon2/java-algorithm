import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        boolean[] list = new boolean[21];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String operator = st.nextToken();

            if (operator.equals("add")) {
                int num = Integer.parseInt(st.nextToken());

                list[num] = true;
            } else if (operator.equals("remove")) {
                int num = Integer.parseInt(st.nextToken());

                list[num] = false;
            } else if (operator.equals("check")) {
                int num = Integer.parseInt(st.nextToken());

                if (list[num]) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if (operator.equals("toggle")) {
                int num = Integer.parseInt(st.nextToken());

                list[num] = !list[num];
            } else if (operator.equals("all")) {
                Arrays.fill(list, true);
            } else if (operator.equals("empty")) {
                Arrays.fill(list, false);
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}