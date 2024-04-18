import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int maxX = -10001;
        int minX = 10001;
        int maxY = -10001;
        int minY = 10001;
        
        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            maxX = Math.max(maxX, A);
            minX = Math.min(minX, A);
            
            maxY = Math.max(maxY, B);
            minY = Math.min(minY, B);
        }
        
        bw.write(String.valueOf((maxX - minX) * (maxY - minY)));
        bw.flush();
        bw.close();
    }
}