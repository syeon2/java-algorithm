import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] list = new String[my_string.length()];
        
        for (int i = 0; i < my_string.length(); i++) {
            list[i] = my_string.substring(i, my_string.length());
        }
        
        Arrays.sort(list);
        
        return list;
    }
}