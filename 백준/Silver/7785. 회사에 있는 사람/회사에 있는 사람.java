import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String cmd = st.nextToken();

            if (cmd.equals("enter")) set.add(name);
            else set.remove(name);
        }

        Queue<String> que = new PriorityQueue<>(Collections.reverseOrder());
        for (String name : set) {
            que.add(name);
        }

        StringBuilder sb = new StringBuilder();
        while (!que.isEmpty()) {
            sb.append(que.remove()).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}