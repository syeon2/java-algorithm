import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int cnt = 0;
        for (int i = 1; i <= 500; i++) {
            
            for (int k = i; k <= 500; k++) {
                if ((i * i) + N == (k * k)) cnt++;
            }
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}