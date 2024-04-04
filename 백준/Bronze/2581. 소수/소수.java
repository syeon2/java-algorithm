import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        int ans = 0;
        int min = -1;
        
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                ans += i;
                if (min == -1) min = i;
            }
        }
        
        if (ans == 0) bw.write("-1");
        else {
            StringBuilder sb = new StringBuilder();
            sb.append(ans).append("\n").append(min);
            
            bw.write(sb.toString());
        }
        
        bw.flush();
        bw.close();
    }
    
    public static boolean isPrime(int n) {
        if (n == 1) return false;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
}