import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] boys = new int[7];
        int[] girls = new int[7];
        
        for (int n = 0; n < N; n++) {
            st = new StringTokenizer(br.readLine());
            
            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            
            if (S == 0) girls[Y]++;
            else boys[Y]++;
        }
        
        int ans = 0;
        for (int i = 1; i <= 6; i++) {
            ans += girls[i] / 2;
            ans += boys[i] / 2;
            
            ans += girls[i] % 2;
            ans += boys[i] % 2;
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}