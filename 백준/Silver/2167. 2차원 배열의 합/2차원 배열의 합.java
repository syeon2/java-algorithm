import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] list = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            for (int k = 0; k < M; k++) {
                list[i][k] = Integer.parseInt(st.nextToken());
            }
        }
        
        int K = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int n = 0; n < K; n++) {
            st = new StringTokenizer(br.readLine());
            
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            
            int sum = 0;
            for (int r = i; r <= x; r++) {
                for (int c = j; c <= y; c++) {
                    sum += list[r][c];
                }
            }
            
            sb.append(sum).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}