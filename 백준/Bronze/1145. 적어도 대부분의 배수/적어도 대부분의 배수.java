import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Integer[] list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            
            for (int k = i + 1; k < list.length; k++) {
                
                for (int j = k + 1; j < list.length; j++) {
                    int min = lcm(list[i], lcm(list[k], list[j]));
                    
                    ans = Math.min(ans, min);
                }
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
    
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        
        return gcd(b, a % b);
    }
}