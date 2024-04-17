import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int N = Integer.parseInt(st.nextToken());
            
            int[] list = new int[N];
            for (int i = 0; i < N; i++) {
                list[i] = Integer.parseInt(st.nextToken());
            }
            
            long sum = 0;
            
            for (int i = 0; i < N; i++) {
                for (int k = i + 1; k < N; k++) {
                    sum += gcd(list[i], list[k]);
                }
            }
            
            sb.append(sum).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}