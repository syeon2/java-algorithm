class Solution {
    
    public int[] dx = {1, 0, -1, 0};
    public int[] dy = {0, 1, 0, -1};
    
    public int[] solution(int rows, int columns, int[][] queries) {
        int[][] board = new int[rows + 1][columns + 1];
        
        int init = 1;
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= columns; k++) {
                board[i][k] = init++;
            }
        }
        
        int[] ans = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int minX = queries[i][1];
            int minY = queries[i][0];
            
            int maxX = queries[i][3];
            int maxY = queries[i][2];
            
            int curX = minX;
            int curY = minY;
            
            int nextNum = board[curY][curX];
            
            int curDirec = 0;
            
            int minAns = Integer.MAX_VALUE;
            while (true) {
                int nx = curX + dx[curDirec];
                int ny = curY + dy[curDirec];
                
                if (isRange(nx, ny, minX, minY, maxX, maxY)) {
                    minAns = Math.min(minAns, board[ny][nx]);
                    
                    int temp = nextNum;
                    nextNum = board[ny][nx];
                    board[ny][nx] = temp;
                    
                    curX = nx;
                    curY = ny;
                } else curDirec = turnDirec(curDirec);
                
                if (curX == minX && curY == minY) break;
            }
            
            ans[i] = minAns;
        }
        
        return ans;
    }
    
    public boolean isRange(int x, int y, int minX, int minY, int maxX, int maxY) {
        if (x >= minX && x <= maxX && y >= minY && y <= maxY) return true;
        
        return false;
    }
    
    public int turnDirec(int direc) {
        return (direc + 1) % 4;
    }
}