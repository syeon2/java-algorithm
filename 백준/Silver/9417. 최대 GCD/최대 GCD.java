import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int n = 0; n < N; n++) {
            Integer[] list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
            
            int max = Integer.MIN_VALUE;
            
            for (int i = 0; i < list.length; i++) {
                
                for (int k = i + 1; k < list.length; k++) {
                    if (i == k) continue;
                    int g = gcd(list[i], list[k]);
                    
                    max = Math.max(max, g);
                }
            }
            
            sb.append(max).append("\n");
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