import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[][] board = new int[101][101];
        
        for (int n = 0; n < 4; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            
            for (int r = y1; r < y2; r++) {
                for (int c = x1; c < x2; c++) {
                    board[r][c] = 1;
                }
            }
        }
        
        int ans = 0;
        for (int r = 0; r < 101; r++) {
            for (int c = 0; c < 101; c++) {
                ans += board[r][c];
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}