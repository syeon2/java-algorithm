import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int cnt = 1;
        while (true) {
            if (a % 2 == 1 && a + 1 == b) break;
            else if (b % 2 == 1 && a == b + 1) break;
            
            if (a % 2 == 1) a = (a + 1) / 2;
            else a /= 2;
            
            if (b % 2 == 1) b = (b + 1) / 2;
            else b /= 2;
            
            cnt++;
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}