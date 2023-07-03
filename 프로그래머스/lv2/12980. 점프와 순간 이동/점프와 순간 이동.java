import java.util.*;

public class Solution {
    
    static int answer = Integer.MAX_VALUE;
    
    public int solution(int n) {
        recur(n, 1);

        return answer;
    }
    
    public void recur(int n, int count) {
        if (n == 1) {
			answer = Math.min(answer, count);
			return;
		}
		if (n < 1) return;

		if (n % 2 == 0) recur(n / 2, count);
		else recur(n - 1, ++count);
    }
}