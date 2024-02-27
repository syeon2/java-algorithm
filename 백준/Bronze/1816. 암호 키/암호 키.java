import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int n = 0; n < N; n++) {
            long num = Long.parseLong(br.readLine());
            
            boolean flag = true;
            
            for (int i = 2; i <= 1000000; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) sb.append("YES\n");
            else sb.append("NO\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}