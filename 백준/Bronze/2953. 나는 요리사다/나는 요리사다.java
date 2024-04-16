import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int ansMax = 0;
        int ansIdx = 0;
        
        for (int n = 0; n < 5; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += Integer.parseInt(st.nextToken());
            }
            
            if (ansMax < sum) {
                ansMax = sum;
                ansIdx = n + 1;
            }
        }
        
        bw.write(ansIdx + " " + ansMax);
        bw.flush();
        bw.close();
    }
}