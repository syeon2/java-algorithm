import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int[][] list = new int[N][2];
        
        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int D = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            
            list[n][0] = D;
            list[n][1] = C;
        }
        
        int ans = 0;
        for (int i = 0; i < N; i++) {
            
            boolean flag = true;
            
            for (int k = 0; k < N; k++) {
                if (i == k) continue;
                
                if (list[i][0] > list[k][0] && list[i][1] >= list[k][1]) {
                    flag = false;
                    break;
                }
                
                if (list[i][1] > list[k][1] && list[i][0] >= list[k][0]) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) ans++;
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}