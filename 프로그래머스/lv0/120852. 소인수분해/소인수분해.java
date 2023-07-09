import java.util.*;

class Solution {
    public int[] solution(int n) {
        SortedSet<Integer> set = new TreeSet<>();
        
        while (n != 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    set.add(i);
                    n /= i;
                    break;
                }
            }
        }
        
        int[] answer = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            answer[index++] = num;
        }
        
        return answer;
    }
}