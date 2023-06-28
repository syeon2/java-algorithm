class Solution {
    public int solution(int a, int b) {
        
        int x = Integer.parseInt(String.valueOf(a).concat(String.valueOf(b)));
        int y = Integer.parseInt(String.valueOf(b).concat(String.valueOf(a)));
        
        return Math.max(x, y);
    }
}