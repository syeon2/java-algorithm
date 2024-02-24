import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int N = Integer.parseInt(st.nextToken());
        
        int ans = 0;
        for (int i = 0; i <= 50; i++) {
            for (int k = 0; k <= 50; k++) {
                for (int j = 0; j <= 50; j++) {
                    if ((a * i) + (k * b) + (j * c) == N) ans = 1;
                }
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}