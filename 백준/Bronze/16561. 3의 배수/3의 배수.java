import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int ans = 0;
        for (int i = 3; i <= N; i += 3) {
            for (int k = 3; k <= N - i; k += 3) {
                int a = i;
                int b = k;
                int c = N - a - b;
                
                if (c > 0 && c % 3 == 0) ans++;
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}