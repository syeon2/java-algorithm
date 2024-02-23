import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());
        
        N = N / 100 * 100;
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            if ((N + i) % F == 0) {
                
                if (i < 10) sb.append(0).append(i);
                else sb.append(i);
                
                break;
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}