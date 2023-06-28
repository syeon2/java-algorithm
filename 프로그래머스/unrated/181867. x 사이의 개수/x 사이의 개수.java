class Solution {
    public int[] solution(String myString) {        
        String[] list = myString.split("x", -1);
        
        int[] answer = new int[list.length];
        for (int i = 0; i < answer.length; i++) {
            if (list[i].equals(" ")) answer[i] = 0;
            else answer[i] = list[i].length();
        }
        
        return answer;
    }
}