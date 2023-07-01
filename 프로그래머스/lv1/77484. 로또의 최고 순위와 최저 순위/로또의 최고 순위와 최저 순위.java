import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> set = new HashSet<>();
        int zero = 0;
        
        for (int i = 0; i < win_nums.length; i++) {
            set.add(win_nums[i]);
        }
        
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) zero++;
            else set.remove(lottos[i]);
        }
        
        int remain = set.size();
        
        int[] answer = new int[2];
        answer[0] = getOrder(6 - remain + zero);
        answer[1] = getOrder(6 - remain);
        
        return answer;
    }
    
    public int getOrder(int answer) {
        if (answer >= 6) return 1;
        else if (answer == 5) return 2;
        else if (answer == 4) return 3;
        else if (answer == 3) return 4;
        else if (answer == 2) return 5;
        else return 6;
    }
}