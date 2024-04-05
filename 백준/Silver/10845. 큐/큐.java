import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> que = new LinkedList<>();
        
        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            String cmd = st.nextToken();
            
            if (cmd.equals("push")) {
                int X = Integer.parseInt(st.nextToken());
                
                que.add(X);
            } else if (cmd.equals("pop")) {
                if (que.isEmpty()) sb.append(-1);
                else sb.append(que.pop());
                
                sb.append("\n");
            } else if (cmd.equals("size")) {
                sb.append(que.size()).append("\n");
            } else if (cmd.equals("empty")) {
                if (que.isEmpty()) sb.append(1);
                else sb.append(0);
                
                sb.append("\n");
            } else if (cmd.equals("front")) {
                if (que.isEmpty()) sb.append(-1);
                else sb.append(que.peek());
                
                sb.append("\n");
            } else {
                if (que.isEmpty()) sb.append(-1);
                else sb.append(que.peekLast());
                
                sb.append("\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}