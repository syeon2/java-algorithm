import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int ans = N / 5;
        if (N % 5 > 0) ans++;
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}