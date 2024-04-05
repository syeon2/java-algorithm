import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[][] list = new int[N][2];
        
        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            
            list[n][0] = weight;
            list[n][1] = height;
        }
        
        int[] ans = new int[N];
        
        for (int i = 0; i < N; i++) {
            int weight = list[i][0];
            int height = list[i][1];
            
            int order = 1;
            
            for (int k = 0; k < N; k++) {
                if (i == k) continue;
                
                int compWeight = list[k][0];
                int compHeight = list[k][1];
                
                if (weight < compWeight && height < compHeight) order++;
            }
            
            ans[i] = order;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(ans[i]).append(" ");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}