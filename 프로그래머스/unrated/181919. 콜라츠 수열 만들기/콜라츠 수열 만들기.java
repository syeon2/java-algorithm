import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                queue.add(n);
            } else {
                n = 3 * n + 1;
                queue.add(n);
            }
        }
        
        int[] answer = new int[queue.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = queue.remove();
        }
        
        return answer;
    }
}