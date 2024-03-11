import java.util.*;

class Solution {
    
    public int[] numbers = {9, 1, 5, 3, 6, 2};
    
    public int[] solution(int[] numbers) {
        Stack<Obj> stack = new Stack<>();
        int[] ans = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int curNum = numbers[i];
            if (i == 0) stack.add(new Obj(curNum, i));
            else {
                while (true) {
                    if (stack.isEmpty()) {
                        stack.add(new Obj(curNum, i));
                        break;
                    }
                    Obj prevNum = stack.peek();

                    if (prevNum.num < curNum) {
                        int idx = prevNum.idx;

                        ans[idx] = curNum;
                        stack.pop();
                    } else {
                        stack.add(new Obj(curNum, i));
                        break;
                    }
                }
            }
        }

        for (Obj obj : stack) {
            ans[obj.idx] = -1;
        }
        
        return ans;
    }
    
    class Obj {
        public int num;
        public int idx;

        public Obj(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }
    }
}