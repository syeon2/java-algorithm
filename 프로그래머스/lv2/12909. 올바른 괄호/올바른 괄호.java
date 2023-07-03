import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        
        int len = s.length();
        for (int i = 0; i < len; i++) {
            
            if (s.charAt(i) == '(') {
                stack.add('(');
            } else {
                if (stack.isEmpty()) return false;
                else stack.pop();
            }
        }
        
        if (stack.isEmpty()) return true;
        else return false;
    }
}