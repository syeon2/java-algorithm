import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = N; i >= 1; i--) {
            sb.append("*".repeat(i)).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
            
    }
}