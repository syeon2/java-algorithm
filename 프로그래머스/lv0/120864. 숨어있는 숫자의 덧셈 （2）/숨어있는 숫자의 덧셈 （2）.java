class Solution {
    public int solution(String my_string) {
        int answer = 0;
            
        String[] list = my_string.split("[a-zA-Z]");
        for (int i = 0; i < list.length; i++) {
            if (!list[i].equals("")) {
                answer += Integer.parseInt(list[i]);   
            }
        }
        
        return answer;
    }
}