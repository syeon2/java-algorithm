class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        
        for (int i = 0; i < n / k; i++) {
            if (i == 0) answer[i] = k;
            else answer[i] = k * i + k;
        }
        
        return answer;
    }
}