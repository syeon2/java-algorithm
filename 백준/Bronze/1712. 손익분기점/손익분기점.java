import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        if (B >= C) bw.write("-1");
        else {
            int cnt = A / (C - B);
            
            if (A % (C - B) >= 0) cnt++;
            
            bw.write(String.valueOf(cnt));
        }
        
        bw.flush();
        bw.close();
    }
}