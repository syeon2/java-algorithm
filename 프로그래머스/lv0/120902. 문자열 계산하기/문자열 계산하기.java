import java.util.*;

class Solution {
    public int solution(String my_string) {
        String[] list = my_string.split(" ");
        
        int answer = Integer.parseInt(list[0]);
        for (int i = 1; i < list.length - 1; i++) {
            if (list[i].equals("+")) answer += Integer.parseInt(list[++i]);
            else if (list[i].equals("-")) answer -= Integer.parseInt(list[++i]);
        }
        
        return answer;
    }
}