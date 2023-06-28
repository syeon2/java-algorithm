import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Deque<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int k = 0; k < arr[i] * 2; k++) {
                    queue.add(arr[i]);
                }
            } else {
                for (int k = 0; k < arr[i]; k++) {
                    queue.pollLast();
                }
            }
        }
        
        int[] list = new int[queue.size()];
        
        for (int i = 0; i < list.length; i++) {
            list[i] = queue.remove();
        }
        
        return list;
    }
}