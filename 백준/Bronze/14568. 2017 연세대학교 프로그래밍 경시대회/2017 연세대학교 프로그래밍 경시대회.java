import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int ans = 0;
        
        for (int a = 1; a < N; a++) {
            
            for (int b = 1; b < N; b++) {
                if (a >= b + 2) {
                    
                    for (int c = 2; c < N; c += 2) {
                        if (a + b + c == N) ans++;
                    }
                }
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}