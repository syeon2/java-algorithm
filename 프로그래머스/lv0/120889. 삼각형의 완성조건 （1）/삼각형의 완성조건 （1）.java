import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        int x = sides[0];
        int y = sides[1];
        int z = sides[2];
        
        if (z < x + y) return 1;
        else return 2;
    }
}