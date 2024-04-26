import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int cmd = Integer.parseInt(st.nextToken());
            
            if (cmd == 1) {
                int num = Integer.parseInt(st.nextToken());
                
                stack.push(num);
            } else if (cmd == 2) {
                if (stack.isEmpty()) sb.append(-1);
                else sb.append(stack.pop());
                
                sb.append("\n");
            } else if (cmd == 3) {
                sb.append(stack.size()).append("\n");
            } else if (cmd == 4) {
                if (stack.isEmpty()) sb.append(1);
                else sb.append(0);
                
                sb.append("\n");
            } else {
                if (stack.isEmpty()) sb.append(-1);
                else sb.append(stack.peek());
                
                sb.append("\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}