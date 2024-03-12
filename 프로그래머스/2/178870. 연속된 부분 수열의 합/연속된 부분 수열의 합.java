class Solution {
    public int[] solution(int[] sequence, int k) {
        int first = 0;
        int second = 0;
        
        int sum = sequence[0];
        
        int len = Integer.MAX_VALUE;
        int ansX1 = 0;
        int ansX2 = 0;
        
        while (true) {
            if (sum == k) {
                if (Math.abs(first - second) < len) {
                    len = Math.abs(first - second);
                    
                    ansX1 = first;
                    ansX2 = second;
                }
            }
            
            if (sum < k) {
                first++;
                
                if (first == sequence.length) break;
                
                sum += sequence[first];
            } else {
                sum -= sequence[second];
                
                second++;
                
                if (second == sequence.length) break;
            }
        }
        
        int[] ans = new int[2];
        ans[0] = ansX2;
        ans[1] = ansX1;
        
        return ans;
    }
}