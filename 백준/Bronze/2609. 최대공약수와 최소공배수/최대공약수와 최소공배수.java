import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int max = gcd(Math.min(A, B), Math.max(A, B));
        int min = A * B / max;
        
        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(min));
        
        bw.flush();
        bw.close();
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        
        return gcd(b, a % b);
    }
}