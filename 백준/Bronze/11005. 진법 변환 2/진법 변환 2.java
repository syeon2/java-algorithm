import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        bw.write(changeNotation(A, B));
        bw.flush();
        bw.close();
    }
    
    public static String changeNotation(int num, int b) {
        StringBuilder sb = new StringBuilder();
        
        while (num > 0) {
            int remain = num % b;
            
            if (remain < 10) sb.insert(0, remain);
            else {
                char c = (char) ('A' + remain - 10);
                
                sb.insert(0, c);
            }
            
            num /= b;
        }
        
        return sb.toString();
    }
}