import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        for (int i = 0; i < arr.length; i++) {
            
            for (int k = 0; k < delete_list.length; k++) {
                
                if (arr[i] == delete_list[k]) arr[i] = 0;
            }
        }
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count++;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) queue.add(arr[i]);
        }
        
        int[] answer = new int[queue.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = queue.remove();
        }
        
        return answer;
    }
}