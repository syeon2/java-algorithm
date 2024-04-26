import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        int A = 100;
        int B = 100;
        
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if (a > b) B -= a;
            else if (b > a) A -= b;
        }
        
        bw.write(String.valueOf(A));
        bw.newLine();
        bw.write(String.valueOf(B));
        
        bw.flush();
        bw.close();
    }
}