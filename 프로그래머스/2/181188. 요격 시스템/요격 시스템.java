import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        Arrays.sort(targets, new Comparator<>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[1] == b[1]) {
                    return a[0] - b[0];
                }
                
                return b[1] - a[1];
            }
        });
        
        int start = targets[0][0];
        int end = targets[0][1] - 1;
        
        int cnt = 1;
        for (int i = 1; i < targets.length; i++) {
            int bombStart = targets[i][0];
            int bombEnd = targets[i][1] - 1;
            
            if (bombEnd >= start && bombEnd <= end) {
                start = Math.max(start, bombStart);
                end = Math.min(end, bombEnd);
            } else {
                cnt++;
                
                start = bombStart;
                end = bombEnd;
            }
        }
        
        return cnt;
    }
}