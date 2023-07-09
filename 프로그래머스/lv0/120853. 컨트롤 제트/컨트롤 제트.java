import java.util.*;

class Solution {
    public int solution(String s) {
        String[] list = s.split(" ");
        
        Stack<Integer> stack = new Stack<>();
        for (String str : list) {
            if (str.equals("Z")) {
                if (!str.isEmpty()) stack.pop();
            } else {
                stack.add(Integer.parseInt(str));
            }
        }
        
        int answer = 0;
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }
        
        return answer;
    }
}