class Solution {
    public int solution(String[] strArr) {
        int[] list = new int[31];
        
        for (int i = 0; i < strArr.length; i++) {
            
            int len = strArr[i].length();
            
            list[len]++;
        }
        
        int answer = 0;
        for (int i = 0; i < list.length; i++) {
            answer = Math.max(answer, list[i]);
        }
        
        return answer;
    }
}