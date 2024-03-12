class Solution {
    public int[] solution(int[][] arr) {
        int[] ans = new int[2];
        
        int X = arr[0].length;
        int Y = arr.length;
        
        backtracking(arr, ans, 0, X, 0, Y);
        
        return ans;
    }
    
    public void backtracking(int[][] board, int[] ans, int startX, int endX, int startY, int endY) {
        if (startX >= endX || startY >= endY) return;
        
        int cnt1 = 0;
        int cnt0 = 0;
        
        for (int y = startY; y < endY; y++) {
            for (int x = startX; x < endX; x++) {
                if (board[y][x] == 1) cnt1++;
                else cnt0++;
            }
        }
        
        if (cnt1 > 0 && cnt0 == 0) ans[1]++;
        else if (cnt1 == 0 && cnt0 > 0) ans[0]++;
        else {
            int middleX = (endX + startX) / 2;
            int middleY = (endY + startY) / 2;
            
            backtracking(board, ans, startX, middleX, startY, middleY);
            backtracking(board, ans, middleX, endX, startY, middleY);
            backtracking(board, ans, startX, middleX, middleY, endY);
            backtracking(board, ans, middleX, endX, middleY, endY);
        }
    }
}