import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        int cnt = 0;
        for (int n = 0; n < N; n++) {
            int num = Integer.parseInt(st.nextToken());
            
            if (isPrime(num)) cnt++;
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
    
    public static boolean isPrime(int num) {
        if (num == 1) return false;
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        
        return true;
    }
}