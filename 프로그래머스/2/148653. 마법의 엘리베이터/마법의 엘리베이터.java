class Solution {
    public int solution(int storey) {
        return recur(storey, 0);
    }
    
    public int recur(int storey, int cnt) {
        if (storey < 10) {
            int down = storey;
            int up = (10 - storey) + 1;
            
            return Math.min(down, up) + cnt;
        }
        
        if (storey % 10 == 0) return recur(storey / 10, cnt);
        else {
            int downStep = storey % 10;
            int upStep = (10 - (storey % 10));
            
            int down = recur(storey - downStep, cnt + downStep);
            int up = recur(storey + upStep, cnt + upStep);
            
            return Math.min(down, up);
        }
    }
}