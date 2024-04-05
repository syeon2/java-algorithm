import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            que.add(i);
        }
        
        while (que.size() != 1) {
            int cnt = K - 1;
            
            while (cnt-- > 0) {
                que.add(que.remove());
            }
            
            sb.append(que.remove()).append(", ");
        }
        
        sb.append(que.remove()).append(">");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}