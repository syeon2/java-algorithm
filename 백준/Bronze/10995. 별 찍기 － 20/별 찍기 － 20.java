import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int n = 1; n <= N; n++) {
            if (n % 2 == 1) {
                for (int i = 1; i <= N; i++) {
                    sb.append("* ");
                }
            } else {
                for (int i = 1; i <= N; i++) {
                    sb.append(" *");
                }
            }
            
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}