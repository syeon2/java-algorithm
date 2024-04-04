import java.io.*;

public class Main {
    
    public static int[] dx = {1, 0};
    public static int[] dy = {0, 1};
    
    public static int N;
    public static char[][] board;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        N = Integer.parseInt(br.readLine());
        
        board = new char[N][N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            
            for (int k = 0; k < N; k++) {
                board[i][k] = str.charAt(k);
            }
        }
        
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                
                for (int j = 0; j < 2; j++) {
                    int nx = k + dx[j];
                    int ny = i + dy[j];
                    
                    if (isRange(nx, ny)) {
                        char temp = board[i][k];
                        board[i][k] = board[ny][nx];
                        board[ny][nx] = temp;
                        
                        ans = Math.max(ans, findMax());
                        
                        board[ny][nx] = board[i][k];
                        board[i][k] = temp;
                    }
                }
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
    
    public static boolean isRange(int x, int y) {
        if (x >= 0 && x < N && y >= 0 && y < N) return true;
        
        return false;
    }
    
    public static int findMax() {
        int max = 0;
        
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                char c = board[i][k];
                
                int x = k;
                int y = i;
                
                int cnt = 1;
                
                for (int j = x + 1; j < N; j++) {
                    if (c == board[y][j]) cnt++;
                    else break;
                }
                
                for (int j = x - 1; j >= 0; j--) {
                    if (c == board[y][j]) cnt++;
                    else break;
                }
                
                max = Math.max(max, cnt);
                cnt = 1;
                
                for (int j = y + 1; j < N; j++) {
                    if (c == board[j][x]) cnt++;
                    else break;
                }
                
                for (int j = y - 1; j >= 0; j--) {
                    if (c == board[j][x]) cnt++;
                    else break;
                }
                
                max = Math.max(max, cnt);
            }
        }
        
        return max;
    }
}