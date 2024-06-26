import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Stack<Integer> stack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (num == 0) stack.pop();
            else stack.push(num);
        }
        
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}