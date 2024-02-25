import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int[] cnt = new int[a + b + c + 1];
        
        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <= b; k++) {
                for (int j = 1; j <= c; j++) {
                    int sum = i + k + j;
                    
                    cnt[sum]++;
                }
            }
        }
        
        int max = cnt[1];
        int ans = 1;
        
        for (int i = 1; i < cnt.length; i++) {
            if (max < cnt[i]) {
                max = cnt[i];
                ans = i;
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}