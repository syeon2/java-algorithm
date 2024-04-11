import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int eLimit = 15;
        int sLimit = 28;
        int mLimit = 19;
        
        int curY = 1;
        
        int e = 1;
        int s = 1;
        int m = 1;
        
        while (true) {
            if (e == E && s == S && m == M) break;
            
            curY++;
            
            e++;
            if (e > eLimit) e = 1;
            
            s++;
            if (s > sLimit) s = 1;
            
            m++;
            if (m > mLimit) m = 1;
        }
        
        bw.write(String.valueOf(curY));
        bw.flush();
        bw.close();
    }
}