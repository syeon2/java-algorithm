class Solution {
    
    public int[] emotions;
    public int[][] users;
    
    public int[] discountRates = {10, 20, 30, 40};
    public int[] ans = new int[2];
    
    public int[] solution(int[][] u, int[] e) {
        emotions = e;
        users = u;
        
        int[] rates = new int[emotions.length];
        
        recur(0, rates);
        
        return ans;
    }
    
    public void recur(int idx, int[] rates) {
        if (idx == emotions.length) {
            int plusCnt = 0;
            int totalCost = 0;
            
            for (int i = 0; i < users.length; i++) {
                int targetRate = users[i][0];
                int targetCost = users[i][1];
                
                int tempCost = 0;
                boolean isPlus = false;
                
                for (int k = 0; k < emotions.length; k++) {
                    if (rates[k] < targetRate) continue;
                    
                    int cost = emotions[k] - (emotions[k] * rates[k] / 100);
                    
                    tempCost += cost;
                    
                    if (tempCost >= targetCost) {
                        isPlus = true;
                        tempCost = 0;
                        break;
                    }
                }
                
                if (isPlus) plusCnt++;
                else totalCost += tempCost;
            }
            
            if (ans[0] < plusCnt) {
                ans[0] = plusCnt;
                ans[1] = totalCost;
            } else {
                if (ans[0] == plusCnt) {
                    ans[1] = Math.max(ans[1], totalCost);
                }
            }
            
            return;
        }
        
        for (int i = 0; i < 4; i++) {
            rates[idx] = discountRates[i];
            recur(idx + 1, rates);
        }
    }
}