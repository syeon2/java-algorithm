import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int cnt = N / 5;
        
        int ans = -1;
        while (cnt >= 0) {
            int temp = N - (5 * cnt);
            
            if (temp % 3 == 0) {
                ans = cnt + (temp / 3);
                break;
            }
            
            cnt--;
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}