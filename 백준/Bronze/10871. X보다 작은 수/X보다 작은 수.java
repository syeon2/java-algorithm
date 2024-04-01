import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        for (int n = 0; n < N; n++) {
            int num = Integer.parseInt(st.nextToken());
            
            if (num < X) sb.append(num).append(" ");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}