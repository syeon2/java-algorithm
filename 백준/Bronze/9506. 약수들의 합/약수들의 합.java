import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num == -1) break;

            int sum = 0;
            Queue<Integer> que = new LinkedList<>();
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                    que.add(i);
                }
            }

            if (sum == num) {
                sb.append(num).append(" = ");

                while (que.size() != 1) {
                    sb.append(que.remove()).append(" + ");
                }

                sb.append(que.remove()).append("\n");
            } else {
                sb.append(num).append(" is NOT perfect.").append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}