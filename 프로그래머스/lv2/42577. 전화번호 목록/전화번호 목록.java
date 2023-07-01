import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < phone_book.length; i++) {
            set.add(phone_book[i]);
        }
        
        for (int i = 0; i < phone_book.length; i++) {
            
            String str = phone_book[i];
            
            for (int k = 1; k < str.length(); k++) {
                String s = str.substring(0, k);
                if (set.remove(s)) return false;
            }
        }
        
        return true;
    }
}