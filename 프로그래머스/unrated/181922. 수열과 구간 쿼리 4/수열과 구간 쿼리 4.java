class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            
            int s1 = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for (int l = s1; l <= e; l++) {
                if (l % k == 0) arr[l]++;
            }
        }
        
        return arr;
    }
}