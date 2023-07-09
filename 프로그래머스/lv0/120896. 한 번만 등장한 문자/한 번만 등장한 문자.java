import java.util.*;

class Solution {
    public String solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        
        String[] sList = s.split("");
        
        for (int i = 0; i < sList.length; i++) {
            map.put(sList[i], map.getOrDefault(sList[i], 0) + 1);
        }
        
        List<String> arrList = new ArrayList<>();
        for (String str : map.keySet()) {
            if (map.get(str) == 1) arrList.add(str);
        }
        
        Collections.sort(arrList);
        
        return String.join("", arrList);
    }
}