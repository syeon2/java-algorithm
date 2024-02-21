import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int ans = 0;
        
        for (int i = 1; i <= N; i++) {
            
            int temp = i;
            int sum = temp;
            
            while (temp > 0) {
                sum += (temp % 10);
                temp /= 10;
            }
            
            if (sum == N) {
                ans = i;
                break;
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}