import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        char[][][] board = new char[N][5][7];
        boolean[][] isSame = new boolean[5][7];
        
        for (int n = 0; n < N; n++) {
            for (int i = 0; i < 5; i++) {
                String str = br.readLine();
                
                for (int k = 0; k < 7; k++) {
                    board[n][i][k] = str.charAt(k);
                }
            }
        }
        
        int start = 0;
        int end = 0;
        
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            for (int k = i + 1; k < N; k++) {
                
                char[][] b1 = board[i];
                char[][] b2 = board[k];
                
                int cnt = 0;
                
                for (int y = 0; y < 5; y++) {
                    for (int x = 0; x < 7; x++) {
                        if (b1[y][x] != b2[y][x]) cnt++;
                    }
                }
                
                if (min > cnt) {
                    start = i;
                    end = k;
                    min = cnt;
                }
            }
        }
        
        bw.write(String.format("%d %d", start + 1, end + 1));
        bw.flush();
        bw.close();
    }
}