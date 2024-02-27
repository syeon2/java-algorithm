import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int n = 0; n < N; n++) {
            int total = Integer.parseInt(br.readLine());
            
            int cnt = 0;
            
            while (total >= (cnt + (cnt * cnt))) {
                cnt++;
            }
            
            sb.append(cnt - 1).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}