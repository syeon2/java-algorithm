import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] list = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        
        int ans = 0;
        
        for (int i = 2; i <= N; i++) {
            for (int k = 0; k < M; k++) {
                if (i % list[k] == 0) {
                    ans += i;
                    break;
                }
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}