import java.util.*;

class Solution {
    
    public int[] dx = {0, 0, -1, 1};
    public int[] dy = {-1, 1, 0, 0};
    
    public int[] solution(String[] maps) {
        // 여기에 코드를 작성해주세요.
        List<Integer> ansArr = new ArrayList<>();

        int X = maps[0].length();
        int Y = maps.length;

        int[][] map = new int[Y][X];
        for (int i = 0; i < maps.length; i++) {
            char[] strList = maps[i].toCharArray();

            for (int k = 0; k < strList.length; k++) {
                if (strList[k] == 'X') map[i][k] = 0;
                else map[i][k] = strList[k] - '0';
            }
        }
        boolean[][] isVisit = new boolean[Y][X];

        for (int i = 0; i < map.length; i++) {
            for (int k = 0; k < map[i].length; k++) {
                if (isVisit[i][k]) continue;
                int num = recur(map, isVisit, k, i, X, Y);

                if (num > 0) ansArr.add(num);
            }
        }

        int[] ans = new int[ansArr.size()];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = ansArr.get(i);
        }

        Arrays.sort(ans);

        if (ansArr.size() == 0) {
            int[] nonValueAns = {-1};

            return nonValueAns;
        }
        else return ans;
    }
    
    public int recur(int[][] map, boolean[][] isVisit, int x, int y, int X, int Y) {
        if (map[y][x] == 0) return 0;
        
        int totalNum = map[y][x];
        isVisit[y][x] = true;
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (isRange(nx, ny, X, Y) && map[ny][nx] != 0 && !isVisit[ny][nx]) {
                totalNum += recur(map, isVisit, nx, ny, X, Y);
            }
        }
        
        return totalNum;
    }
    
    public boolean isRange(int x, int y, int X, int Y) {
        if (x >= 0 && x < X && y >= 0 && y < Y) return true;
        
        return false;
    }
    
}