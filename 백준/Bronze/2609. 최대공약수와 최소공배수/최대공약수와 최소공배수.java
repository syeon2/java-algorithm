import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int g = gcd(A, B);
        int l = lcm(A, B);
        
        StringBuilder sb = new StringBuilder();
        sb.append(g).append("\n").append(l);
        
        bw.write(sb.toString());
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