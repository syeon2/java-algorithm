import java.util.*;

class Solution {
    
    public HashMap<Integer, Integer> left = new HashMap<>();
    public HashMap<Integer, Integer> right = new HashMap<>();
    
    public int solution(int[] topping) {
        for (int i = 0; i < topping.length; i++) {
            int num = topping[i];

            if (right.containsKey(num)) right.put(num, right.get(num) + 1);
            else right.put(num, 1);
        }

        int ans = 0;
        for (int i = 0; i < topping.length; i++) {
            int num = topping[i];

            right.put(num, right.get(num) - 1);
            if (right.get(num) == 0) right.remove(num);

            if (left.containsKey(num)) left.put(num, left.get(num) + 1);
            else left.put(num, 1);

            if (left.size() == right.size()) {
                ans++;
            }
        }

        return ans;
    }
}