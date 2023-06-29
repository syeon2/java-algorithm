class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        answer += n * 12000;
        int x = k - answer / 120000;
        answer += x * 2000;
        
        return answer;
    }
}