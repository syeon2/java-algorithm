import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int n = 0; n < N; n++) {
            int num = Integer.parseInt(st.nextToken());
            
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) sum += i;
            }
            
            if (sum == num) sb.append("Perfect\n");
            else if (sum < num) sb.append("Deficient\n");
            else sb.append("Abundant\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}