import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int ans = 0;
        
        Queue<Long> q1 = new LinkedList<>();
        Queue<Long> q2 = new LinkedList<>();
        
        long q1Sum = 0;
        long q2Sum = 0;
        
        for (int i = 0; i < queue1.length; i++) {
            q1.add((long) queue1[i]);
            q1Sum += queue1[i];
        }
        
        for (int i = 0; i < queue2.length; i++) {
            q2.add((long) queue2[i]);
            q2Sum += queue2[i];
        }
        
        while (true) {
            if (ans > 1000000) {
                ans = -1;
                break;
            }
            
            if (q1Sum == q2Sum) break;
            
            if (q1Sum > q2Sum) {
                long num = q1.remove();
                q1Sum -= num;
                
                q2.add(num);
                q2Sum += num;
            } else {
                long num = q2.remove();
                q2Sum -= num;
                
                q1.add(num);
                q1Sum += num;
            }
            
            ans++;
        }
        
        return ans;
    }
}