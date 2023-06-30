import java.util.*;

class Solution {
    public Integer[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            
            for (int k = i + 1; k < numbers.length; k++) {
                set.add(numbers[i] + numbers[k]);
            }
        }
        
        Integer[] arr = set.toArray(Integer[]::new);
        Arrays.sort(arr);
        
        return arr;
    }
}