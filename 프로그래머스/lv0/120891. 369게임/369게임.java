import java.util.Arrays;

class Solution {
    public int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split(""))
            .mapToInt(Integer::new)
            .filter(i -> i == 3 || i == 6 || i == 9)
            .count();
    }
}