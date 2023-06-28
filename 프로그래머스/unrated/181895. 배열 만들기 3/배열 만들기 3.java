import java.util.stream.*;
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        return IntStream.concat(
            IntStream.of(Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1)),
            IntStream.of(Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1)))
            .toArray();
    }
}