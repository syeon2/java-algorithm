class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String s1 = my_string.substring(0, s);
        String s2 = my_string.substring(s + overwrite_string.length());
        
        String answer = s1.concat(overwrite_string).concat(s2);
        
        return answer;
    }
}