class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        
        int idx = 2;
        
        while (arr.length > idx) {
            idx *= 2;
        }
        
        int[] answer = new int[idx];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}