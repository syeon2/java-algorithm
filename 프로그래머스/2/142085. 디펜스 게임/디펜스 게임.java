import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        
        int ans = 0;
        for (int i = 0; i < enemy.length; i++) {
            if (k > 0) {
                k--;
                que.add(enemy[i]);
            } else {
                int num = enemy[i];

                if (que.peek() < num) {
                    num = que.remove();
                    que.add(enemy[i]);
                }

                if (n >= num) {
                    n -= num;
                } else break;
            }
            
            ans++;
        }
        
        return ans;
    }
}