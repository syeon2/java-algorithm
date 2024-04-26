import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        List<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int n = 1; n <= N; n++) {
            int num = Integer.parseInt(st.nextToken());

            list.add(list.size() - num, n);
        }

        for (int i = 0; i < N; i++) {
            sb.append(list.get(i)).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}