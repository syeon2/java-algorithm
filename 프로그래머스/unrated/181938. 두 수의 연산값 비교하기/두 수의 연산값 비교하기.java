class Solution {
    public int solution(int a, int b) {
        int s1 = Integer.parseInt(String.valueOf(a).concat(String.valueOf(b)));
        int s2 = 2 * a * b;
        
        if (s1 == s2) {
            return a * b;
        } else {
            return Math.max(s1, s2);
        }
    }
}