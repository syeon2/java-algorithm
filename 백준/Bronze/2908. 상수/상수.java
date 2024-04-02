import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int f = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        
        int rF = reverse(f);
        int rS = reverse(s);
        
        bw.write(String.valueOf(Math.max(rF, rS)));
        bw.flush();
        bw.close();
    }
    
    public static int reverse(int num) {
        int pos = 100;
        int rev = 0;
        
        while (pos > 0) {
            int temp = num % 10;
            rev += temp * pos;
            num /= 10;
            pos /= 10;
        }
        
        return rev;
    }
}