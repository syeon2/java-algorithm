import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int num = -1;
        
        int ans = 0;
        
        for (int i = 0; i < order.length; i++) {
            if (i == 0) {
                for (int k = 1; k < order[i]; k++) {
                    stack.add(k);
                }
                
                num = order[i];
                ans++;
            } else {
                if (order[i] > num) {
                    for (int k = num + 1; k < order[i]; k++) {
                        stack.add(k);
                    }
                    
                    num = order[i];
                    ans++;
                } else if (order[i] == stack.peek()) {
                    ans++;
                    stack.pop();
                } else break;
            }
        }
        
        return ans;
    }
}