class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] sArr1 = new String[n];
        String[] sArr2 = new String[n];
        
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
            
            while (s1.length() != n) {
                s1 = "0" + s1;
            }
            
            while (s2.length() != n) {
                s2 = "0" + s2;
            }
            
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < n; k++) {
                char c1 = s1.charAt(k);
                char c2 = s2.charAt(k);
                
                if (c1 == '1' || c2 == '1') sb.append("#");
                else sb.append(" ");
            }
            
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}