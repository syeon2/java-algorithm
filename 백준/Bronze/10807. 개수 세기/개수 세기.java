import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int V = Integer.parseInt(br.readLine());
        
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (V == Integer.parseInt(st.nextToken())) ans++;
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}