import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 0 -> arr.length로 돌면서 min 2값을 찾는다.
        // arr.length -> 0으로 돌면서 max 2값을 찾는다.
        
        int min = -1;
        int max = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                min = i;
                break;
            }
        }
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                max = i;
                break;
            }
        }
        
        if (min == -1 && max == -1) return new int[] {-1};
        else {
            int[] answer = Arrays.copyOfRange(arr, min, max + 1);
        
            return answer;   
        }
    }
}