import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (i == 1) {
                for (int k = 1; k <= N - i; k++) {
                    sb.append(" ");
                }
                
                sb.append("*").append("\n");
            } else if (i == N) {
                for (int k = 1; k <= (N * 2) - 1; k++) {
                    sb.append("*");
                }
            } else {
                for (int k = 1; k <= N - i; k++) {
                    sb.append(" ");
                }
                
                sb.append("*");
                
                for (int k = 1; k <= ((i - 1) * 2 - 1); k++) {
                    sb.append(" ");
                }
                
                sb.append("*").append("\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}