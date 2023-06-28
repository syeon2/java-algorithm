import java.util.stream.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int[] arr = IntStream.range(0, finished.length).filter(i -> !finished[i]).toArray();
        
        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = todo_list[arr[i]];
        }
        
        return result;
    }
}