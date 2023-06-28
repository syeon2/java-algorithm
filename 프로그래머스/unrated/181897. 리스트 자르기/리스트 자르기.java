import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        if (n == 1) {
            int b = slicer[1];
            
            return Arrays.copyOfRange(num_list, 0, b + 1);
        } else if (n == 2) {
            int a = slicer[0];
            
            return Arrays.copyOfRange(num_list, a, num_list.length);
        } else if (n == 3) {
            int a = slicer[0];
            int b = slicer[1];
            
            return Arrays.copyOfRange(num_list, a, b + 1);
        } else {
            int a = slicer[0];
            int b = slicer[1];
            int c = slicer[2];
            
            if (c == 1) {
                return Arrays.copyOfRange(num_list, a, b + 1);
            } else {
                 int[] answer = Arrays.copyOfRange(num_list, a, b + 1);
			
			    return IntStream.range(0, answer.length).filter(i -> i % c == 0)
				.map(i -> answer[i])
				.toArray();
            }
        }
    }
}