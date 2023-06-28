class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            
            for (int k = x; k <= y; k++) {
                arr[k]++;
            }
        }
        
        return arr;
    }
}