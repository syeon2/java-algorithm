import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int up = 1;
        for (int i = 1; i <= N; i++) {
            up *= i;
        }
        
        int down = 1;
        for (int i = N - K; i >= 1; i--) {
            down *= i;
        }
        
        for (int i = 1; i <= K; i++) {
            down *= i;
        }
        
        bw.write(String.valueOf(up / down));
        bw.flush();
        bw.close();
    }
}