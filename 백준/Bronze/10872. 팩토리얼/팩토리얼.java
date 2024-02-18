import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int prod = 1;
        for (int i = 1; i <= N; i++) {
            prod *= i;
        }
        
        bw.write(String.valueOf(prod));
        bw.flush();
        bw.close();
    }
}