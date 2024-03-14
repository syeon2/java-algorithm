import java.util.*;

class Solution {
    public int solution(int[] cards) {
        PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> b - a);
        boolean[] isVisit = new boolean[cards.length];
        
        int len = cards.length;
        
        for (int i = 0; i < len; i++) {
            
            int cnt = 0;
            int curIdx = i;
            
            while (!isVisit[curIdx]) {
                cnt++;
                isVisit[curIdx] = true;
                curIdx = cards[curIdx] - 1;
            }
            
            if (cnt == len) return 0;
            else que.add(cnt);
        }
        
        return que.poll() * que.poll();
    }
}