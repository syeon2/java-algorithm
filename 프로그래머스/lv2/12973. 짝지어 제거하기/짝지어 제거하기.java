import java.util.*;

class Solution {
    public int solution(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        char[] list = s.toCharArray();
        
        for (char c : list) {
            
            if (!stack.isEmpty() && c == stack.peek()) stack.pop();
            else stack.push(c);
        }

    
        if (stack.isEmpty()) return 1;
        else return 0;
    }
}