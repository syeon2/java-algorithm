import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            
            for (int k = 0; k < i; k++) {
                sb.append(" ");
            }
            
            for (int k = 0; k < N - i; k++) {
                sb.append("*");
            }
            
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
}