class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            
            for (int k = i + 1; k < numbers.length; k++) {
                answer = Math.max(answer, numbers[i] * numbers[k]);
            }
        }
        
        return answer;
    }
}