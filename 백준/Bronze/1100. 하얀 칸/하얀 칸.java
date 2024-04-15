import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[][] board = new char[8][8];
        for (int i = 0; i < 8; i++) {
            String str = br.readLine();
            
            for (int k = 0; k < 8; k++) {
                board[i][k] = str.charAt(k);
            }
        }
        
        int ans = 0;
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                if (r % 2 == 0 && c % 2 == 0 && board[r][c] == 'F') ans++;
                else if (r % 2 == 1 && c % 2 == 1 && board[r][c] == 'F') ans++;
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}