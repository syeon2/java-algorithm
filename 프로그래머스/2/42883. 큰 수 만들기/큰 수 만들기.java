import java.util.*;

class Solution {
    public String solution(String number, int k) {
        int len = number.length() - k;
        
        char[] ans = new char[len];
        
        Stack<Character> stack = new Stack<>();
        
        for (char num : number.toCharArray()) {
            
            while (!stack.empty() && stack.peek() < num && k > 0) {
                stack.pop();
                k--;
            }
            
            stack.add(num);
        }
        
        for (int i = 0; i < ans.length; i++) {
            ans[i] = stack.get(i);
        }
        
        return String.valueOf(ans);
    }
}