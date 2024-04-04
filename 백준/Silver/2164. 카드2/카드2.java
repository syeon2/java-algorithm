import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        Queue<Integer> que = new LinkedList<>();
        
        for (int i = 1; i <= N; i++) {
            que.add(i);
        }
        
        while (que.size() != 1) {
            que.remove();
            
            que.add(que.remove());
        }
        
        bw.write(String.valueOf(que.peek()));
        bw.flush();
        bw.close();
    }
}