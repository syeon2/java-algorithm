class Solution {
    public String solution(String my_string, int[] index_list) {
        String[] list = my_string.split("");
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < index_list.length; i++) {
            int idx = index_list[i];
            
            sb.append(list[idx]);
        }
        
        return sb.toString();
    }
}