import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        
        int ans = 1;
        
        int remain = V - A;
        
        ans += remain / (A - B);
        if (remain % (A - B) > 0) ans++;
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}