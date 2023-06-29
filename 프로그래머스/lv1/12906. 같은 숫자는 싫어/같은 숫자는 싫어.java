import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (queue.isEmpty()) queue.add(arr[i]);
            else if (queue.getLast() != arr[i]) queue.add(arr[i]);
        }
        
        int[] answer = new int[queue.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = queue.removeFirst();
        }
        
        return answer;
    }
}