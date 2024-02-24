import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            int cnt = 0;
            for (int i = N; i <= M; i++) {
                cnt += countZero(i);
            }
            
            sb.append(cnt).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
    public static int countZero(int n) {
        char[] list = String.valueOf(n).toCharArray();
        
        int cnt = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == '0') cnt++;
        }
        
        return cnt;
    }
}