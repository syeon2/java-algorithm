import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int[] memo = new int[y + 1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[x] = 0;
        
        for (int i = 1; i <= y; i++) {
            if (memo[i] == Integer.MAX_VALUE) continue;
            
            if (i + n <= y) memo[i + n] = Math.min(memo[i + n], memo[i] + 1);
            if (i * 2 <= y) memo[i * 2] = Math.min(memo[i * 2], memo[i] + 1);
            if (i * 3 <= y) memo[i * 3] = Math.min(memo[i * 3], memo[i] + 1);
        }
        
        if (memo[y] == Integer.MAX_VALUE) return -1;
        else return memo[y];
    }
}