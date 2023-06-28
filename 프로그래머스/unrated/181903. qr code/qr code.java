class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < code.length(); i++) {
            int idx = i % q;
            
            if (idx == r) {
                sb.append(code.substring(i, i + 1));   
            }
        }
        
        return sb.toString();
    }
}