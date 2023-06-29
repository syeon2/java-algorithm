class Solution {
    public int solution(String my_string) {
        char[] list = my_string.toCharArray();
        
        int answer = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] >= '1' && list[i] <= '9') answer += Integer.parseInt(String.valueOf(list[i]));
        }
        
        return answer;
    }
}