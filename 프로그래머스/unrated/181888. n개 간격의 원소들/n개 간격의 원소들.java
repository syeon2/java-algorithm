class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx = 0;
        
        if (num_list.length % n == 0) {
            idx = num_list.length / n;
        } else {
            idx = num_list.length / n + 1;
        }
        
        
        int[] answer = new int[idx];
        
        int x = 0;
        for (int i = 0; i < idx; i++) {
            answer[i] = num_list[x];
            x += n;
        }
        
        return answer;
    }
}