class Solution {
    public String[] solution(String[] names) {
        if (names.length % 5 == 0) {
            String[] answer = new String[names.length / 5];
            
            for (int i = 0; i < answer.length; i++) {
                answer[i] = names[i * 5];
            }
            
            return answer;
        } else {
            String[] answer = new String[names.length / 5 + 1];
            
            for (int i = 0; i < answer.length; i++) {
                answer[i] = names[i * 5];
            }
            
            return answer;
        }
    }
}