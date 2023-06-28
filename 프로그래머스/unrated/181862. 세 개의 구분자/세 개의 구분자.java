import java.util.*;

class Solution {
	public static String[] solution(String myStr) {
		String[] answer = Arrays.stream(myStr.split("a"))
			.filter(s -> !s.equals("a"))
			.map(s -> s.split("b"))
			.flatMap(Arrays::stream)
			.filter(s -> !s.equals("b"))
			.map(s -> s.split("c"))
			.flatMap(Arrays::stream)
			.filter(s -> !s.equals(""))
			.toArray(String[]::new);
        
        if (answer.length == 0) {
            String[] a = new String[1];
            a[0] = "EMPTY";
            return a;
        } else {
            return answer;
        }
	}
}