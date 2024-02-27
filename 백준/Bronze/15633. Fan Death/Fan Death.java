import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) ans += i;
        }
        
        bw.write(String.valueOf((ans * 5) - 24));
        bw.flush();
        bw.close();
    }
}