import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] list = new int[K + 1];
        
        for (int i = 1; i <= K; i++) {
            int num = N * i;
            
            int reverNum = reverse(num);
            
            list[i] = reverNum;
        }
        
        int ans = 0;
        for (int i = 1; i <= K; i++) {
            ans = Math.max(ans, list[i]);
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
    
    public static int reverse(int n) {
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            sb.append(n % 10);
            
            n /= 10;
        }
        
        return Integer.parseInt(sb.toString());
    }
}