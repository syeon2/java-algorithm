class Solution {
    public int[] solution(int[] numbers, String direction) {
        if (direction.equals("right")) {
            int[] answer = new int[numbers.length];
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i + 1] = numbers[i];
            }
            answer[0] = numbers[numbers.length - 1];
            
            return answer;
        } else {
            int[] answer = new int[numbers.length];
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[numbers.length - 1] = numbers[0];
            
            return answer;
        }
    }
}