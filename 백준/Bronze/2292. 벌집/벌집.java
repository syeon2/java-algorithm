import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int prod = 1;
        int cnt = 0;
        
        while (prod + (cnt * 6) < N) {
            prod += (cnt++ * 6);
        }
        
        bw.write(String.valueOf(cnt + 1));
        bw.flush();
        bw.close();
    }
}