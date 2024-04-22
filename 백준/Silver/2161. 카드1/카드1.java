import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            que.add(i);
        }
        
        while (!que.isEmpty()) {
            sb.append(que.remove()).append(" ");
            
            if (!que.isEmpty()) que.add(que.remove());
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}