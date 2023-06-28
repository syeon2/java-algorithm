import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = n; i < num_list.length; i++) {
            queue.add(num_list[i]);
        }
        
        for (int i = 0; i < n; i++) {
            queue.add(num_list[i]);
        }
        
        int[] answer = new int[num_list.length];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = queue.remove();
        }
        
        return answer;
    }
}