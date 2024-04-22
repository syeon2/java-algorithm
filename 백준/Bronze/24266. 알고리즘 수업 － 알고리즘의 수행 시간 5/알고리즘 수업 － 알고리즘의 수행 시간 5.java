import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        long N = Long.parseLong(br.readLine());
        
        long ans = N * N * N;
        
        bw.write(ans + "\n" + 3);
        bw.flush();
        bw.close();
    }
}