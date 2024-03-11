import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        int[][] board = new int[101][101];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            for (int k = x; k < x + 10; k++) {
                for (int j = y; j < y + 10; j++) {
                    board[j][k] = 1;
                }
            }
        }
        
        int ans = 0;
        for (int i = 0; i < 101; i++) {
            for (int k = 0; k < 101; k++) {
                ans += board[i][k];
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}