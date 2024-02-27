import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] list = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i <= N - K; i++) {
            
            int temp = 0;
            for (int k = i; k < i + K; k++) {
                temp += list[k];
            }
            
            if (ans < temp) ans = temp;
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}