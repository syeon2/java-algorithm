import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Long N = Long.parseLong(br.readLine());
        
        int max = 0;
        
        for (int i = 1; i <= N - 1; i++) {
            N -= i;
            
            max = Math.max(max, i);
        }
        
        bw.write(String.valueOf(Math.max(N, max)));
        bw.flush();
        bw.close();
    }
}