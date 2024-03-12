class Solution {
    
    public int[] dx = {0, 1, -1};
    public int[] dy = {1, 0, -1};
    
    public int[] solution(int n) {
        int[][] board = new int[n + 1][n + 1];
        
        int curX = 1;
        int curY = 1;
        
        int direc = 0;
        int cnt = 1;
        
        while (true) {
            board[curY][curX] = cnt;
            
            int nx = curX + dx[direc];
            int ny = curY + dy[direc];
            
            if (isRange(n, nx, ny) && board[ny][nx] == 0) {
                curY = ny;
                curX = nx;
                cnt++;
            } else {
                direc = turnDirec(direc);
                
                nx = curX + dx[direc];
                ny = curY + dy[direc];
                
                
                if (!isRange(n, ny, nx) || board[ny][nx] != 0) break;
            }
        }
        
        int[] ans = new int[cnt];

        int idx = 0;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n; k++) {
                if (board[i][k] == 0) break;
                else ans[idx++] = board[i][k];
            }
        }
        
        return ans;
    }
    
    public boolean isRange(int n, int x, int y) {
        if (x >= 1 && x <= n && y >= 1 && y <= n) return true;
        
        return false;
    }
    
    public int turnDirec(int direc) {
        return (direc + 1) % 3;
    }
}