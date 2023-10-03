import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= N; i++) {
            
            for (int k = 1; k <= i; k++) {
                sb.append("*");
            }
            
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
}