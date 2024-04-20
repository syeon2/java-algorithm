import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        
        int ans = reverse(reverse(X) + reverse(Y));
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
    
    public static int reverse(int num) {
        int reversedNum = 0;
        
        while (num > 0) {
            reversedNum = (reversedNum * 10) + (num % 10);
            num /= 10;
        }
        
        return reversedNum;
    }
}