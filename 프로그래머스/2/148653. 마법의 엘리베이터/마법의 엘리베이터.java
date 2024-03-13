class Solution {
    public int solution(int storey) {
        return recur(storey, 0);
    }
    
    public int recur(int storey, int cnt) {
		    // 남은 충수가 10이하라면 단순 계산으로 마무리
        if (storey < 10) {
            int down = storey;
            int up = (10 - storey) + 1;
            
            return Math.min(down, up) + cnt;
        }
        
        // 현재 움직일 자리수가 0이라면 아래로 내려가지도 올라가지도 못하기 때문에 그대로 0만 제거
        if (storey % 10 == 0) return recur(storey / 10, cnt);
        else {
        // 내려갔을 경우, 올라갔을 경우에서 움직인 모든 값들 중 min값을 찾기 위해 재귀
            int downStep = storey % 10;
            int upStep = (10 - (storey % 10));
            
            int down = recur(storey - downStep, cnt + downStep);
            int up = recur(storey + upStep, cnt + upStep);
            
            return Math.min(down, up);
        }
    }
}