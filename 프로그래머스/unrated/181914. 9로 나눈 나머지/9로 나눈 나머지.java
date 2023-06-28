class Solution {
    public int solution(String number) {
        String[] list = number.split("");
        
        int answer = 0;
        for (int i = 0; i < list.length; i++) {
            answer += Integer.parseInt(list[i]);
        }
        
        answer %= 9;
        
        return answer;
    }
}