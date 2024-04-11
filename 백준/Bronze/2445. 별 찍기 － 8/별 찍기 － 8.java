import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= N; i++) {
            for (int k = 1; k <= i; k++) {
                sb.append("*");
            }
            
            for (int k = 1; k <= (N - i) * 2; k++) {
                sb.append(" ");
            }
            
            for (int k = 1; k <= i; k++) {
                sb.append("*");
            }
            
            sb.append("\n");
        }
        
        for (int i = N - 1; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                sb.append("*");
            }
            
            for (int k = 1; k <= (N - i) * 2; k++) {
                sb.append(" ");
            }
            
            for (int k = 1; k <= i; k++) {
                sb.append("*");
            }
            
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}