import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int ans = 0;
        
        int temp = 0;
        for (int n = 0; n < 10; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            temp = temp - a + b;
            
            ans = Math.max(ans, temp);
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}