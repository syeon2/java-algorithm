import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String cmd = st.nextToken();

            if (cmd.equals("enter")) set.add(name);
            else set.remove(name);
        }

        StringBuilder sb = new StringBuilder();
        for (String name : set) {
            sb.append(name).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}