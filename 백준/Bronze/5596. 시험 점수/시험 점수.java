import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int ans = 0;
        for (int n = 0; n < 2; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int temp = 0;
            for (int i = 0; i < 4; i++) {
                temp += Integer.parseInt(st.nextToken());
            }
            
            ans = Math.max(ans, temp);
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}