import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = N; i >= 1; i--) {
            for (int k = 0; k < N - i; k++) {
                sb.append(" ");
            }
            
            for (int k = 0; k < (i * 2) - 1; k++) {
                sb.append("*");
            }
            
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}