import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        while (N > 1) {
            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    sb.append(i).append("\n");
                    N /= i;
                    break;
                }
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}