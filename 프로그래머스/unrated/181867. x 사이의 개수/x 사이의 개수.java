class Solution {
    public int[] solution(String myString) {
        char[] cList = myString.toCharArray();
        if (cList[cList.length - 1] == 'x') {
            myString = myString + " ";
        }
        
        
        String[] list = myString.split("x");
        
        int[] answer = new int[list.length];
        for (int i = 0; i < answer.length; i++) {
            if (list[i].equals(" ")) answer[i] = 0;
            else answer[i] = list[i].length();
        }
        
        return answer;
    }
}