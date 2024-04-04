import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        char[][] board = new char[N][M];
        for (int n = 0; n < N; n++) {
            String str = br.readLine();
            
            for (int m = 0; m < M; m++) {
                board[n][m] = str.charAt(m);
            }
        }
        
        int ans = Integer.MAX_VALUE;
        
        for (int r = 0; r <= N - 8; r++) {
            for (int c = 0; c <= M - 8; c++) {
                
                int cnt1 = 0;
                int cnt2 = 0;
                
                for (int i = r; i < r + 8; i++) {
                    for (int k = c; k < c + 8; k++) {
                        if ((i + k) % 2 == 0 && board[r][c] != board[i][k]) cnt1++;
                        else if ((i + k) % 2 == 1 && board[r][c] == board[i][k]) cnt1++;
                        
                        if ((i + k) % 2 == 1 && board[r][c] != board[i][k]) cnt2++;
                        else if ((i + k) % 2 == 0 && board[r][c] == board[i][k]) cnt2++;
                    }
                }
                
                ans = Math.min(ans, Math.min(cnt1, cnt2));
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}