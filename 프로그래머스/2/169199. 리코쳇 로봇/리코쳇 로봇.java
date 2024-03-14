import java.util.*;

class Solution {
    
    public int[] dx = {0, 0, -1, 1};
    public int[] dy = {-1, 1, 0, 0};
    
    public int solution(String[] b) {
        int X = b[0].length();
        int Y = b.length;
        
        Queue<Integer[]> que = new LinkedList<>();
        
        char[][] board = new char[Y][X];
        int[][] isVisit = new int[Y][X];
        
        
        int gX = 0;
        int gY = 0;
        
        for (int i = 0; i < Y; i++) {
            char[] list = b[i].toCharArray();
            
            for (int k = 0; k < X; k++) {
                board[i][k] = list[k];
                
                if (list[k] == 'D') isVisit[i][k] = -1;
                else if (list[k] == 'R') {
                    Integer[] pos = {k, i};
                    
                    que.add(pos);
                } else if (list[k] == 'G') {
                    gX = k;
                    gY = i;
                    
                    isVisit[i][k] = Integer.MAX_VALUE;
                } else isVisit[i][k] = Integer.MAX_VALUE;
            }
        }
        
        while (!que.isEmpty()) {
            Integer[] pos = que.remove();
            
            int curX = pos[0];
            int curY = pos[1];
            int curValue = isVisit[curY][curX];
            
            for (int i = 0; i < 4; i++) {
                int direc = i;
                
                int tempX = curX;
                int tempY = curY;
                
                while (true) {
                    int nx = tempX + dx[direc];
                    int ny = tempY + dy[direc];
                    
                    if (isRange(nx, ny, X, Y) && board[ny][nx] != 'D') {
                        tempX = nx;
                        tempY = ny;
                    } else break;
                }
                
                if (curValue + 1 < isVisit[tempY][tempX]) {                    
                    Integer[] newPos = {tempX, tempY};
                    isVisit[tempY][tempX] = curValue + 1;
                    que.add(newPos);
                }
            }
        }
        
        if (isVisit[gY][gX] == Integer.MAX_VALUE) return -1;
        else return isVisit[gY][gX];
    }
    
    public boolean isRange(int x, int y, int X, int Y) {
        if (x >= 0 && x < X && y >= 0 && y < Y) return true;
        
        return false;
    }
}