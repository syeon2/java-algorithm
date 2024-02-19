import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] list = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        
        int min = Integer.MAX_VALUE;
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            
            for (int k = i + 1; k < N; k++) {
                
                for (int j = k + 1; j < N; j++) {
                    int sum = list[i] + list[k] + list[j];
                    
                    int absSub = Math.abs(M - sum);
                    
                    if (min > absSub && sum <= M) {
                        min = absSub;
                        ans = sum;
                    }
                }
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}