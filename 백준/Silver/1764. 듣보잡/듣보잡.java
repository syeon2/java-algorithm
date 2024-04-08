import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        Set<String> ans = new TreeSet<>();

        for (int i = 0; i < M; i++) {
            String w = br.readLine();

            if (set.contains(w)) {
                ans.add(w);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(ans.size()).append("\n");
        
        for (String s : ans) {
            sb.append(s).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}