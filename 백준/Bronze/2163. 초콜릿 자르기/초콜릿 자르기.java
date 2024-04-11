import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()) - 1;
        int M = Integer.parseInt(st.nextToken()) - 1;
        
        int cnt = M;
        while (N-- > 0) {
            cnt++;
            cnt += M;
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}