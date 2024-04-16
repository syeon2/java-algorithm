import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        Queue<String> que = new PriorityQueue<>();
        for (int i = 0; i < str.length(); i++) {
            que.add(str.substring(i));
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