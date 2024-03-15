class Solution {
    
    public static int[] apachInfo;
    
    public static int[] ans = new int[11];
    public static int[] scoreBoard = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    public static int maxSub = 0;
    
    public int[] solution(int n, int[] info) {
        apachInfo = info;
        int[] lionInfo = new int[11];
        
        recur(0, n, lionInfo);
        
        boolean flag = true;
        
        for (int i = 0; i < 11; i++) {
            if (ans[i] >= 0) flag = false;
        }
        
        if (maxSub == 0) {
            int[] nonAns = {-1};
            
            return nonAns;
        } else return ans;
    }
    
    public void recur(int idx, int arrow, int[] lionInfo) {
        if (idx == 11) {
            int sub = 0;
            
            int apachScore = 0;
            int lionScore = 0;
            for (int i = 0; i < 11; i++) {
                if (apachInfo[i] > 0 && apachInfo[i] >= lionInfo[i]) apachScore += scoreBoard[i];
                else if (lionInfo[i] > 0 && apachInfo[i] < lionInfo[i]) lionScore += scoreBoard[i];
            }
            
            if (maxSub < lionScore - apachScore) {
                maxSub = lionScore - apachScore;
                int[] tempAns = new int[11];
                
                for (int i = 0; i < 11; i++) {
                    tempAns[i] = lionInfo[i];
                }
                
                if (arrow > 0) tempAns[10] += arrow;
                
                ans = tempAns;
            } else if (maxSub == lionScore - apachScore) {
                int totalScore = 0;
                for (int i = 0; i < 11; i++) {
                    totalScore += (ans[i]) * scoreBoard[i];
                }
                
                int compScore = 0;
                for (int i = 0; i < 11; i++) {
                    compScore += (lionInfo[i] * scoreBoard[i]);
                }
                
                if (compScore < totalScore) {
                    maxSub = lionScore - apachScore;
                    int[] tempAns = new int[11];

                    for (int i = 0; i < 11; i++) {
                        tempAns[i] = lionInfo[i];
                    }

                    if (arrow > 0) tempAns[10] += arrow;

                    ans = tempAns;
                }
            }
            
            return;
        }
        
        // 쏘는 경우
        int curApachScore = apachInfo[idx];

        if (curApachScore < arrow) {
            int remainArrow = arrow - (curApachScore + 1);

            int[] newInfo = getNewInfo(lionInfo, idx, curApachScore + 1);
            recur(idx + 1, remainArrow, newInfo);
        }

        // 안쏘는 경우
        recur(idx + 1, arrow, getNewInfo(lionInfo, idx, 0));
    }
    
    public int[] getNewInfo(int[] info, int idx, int num) {
        int[] list = new int[11];
        
        for (int i = 0; i < info.length; i++) {
            list[i] = info[i];
        }
        
        list[idx] = num;
        
        return list;
    }
}