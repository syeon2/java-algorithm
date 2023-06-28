class Solution {
    public int solution(String myString, String pat) {
        char[] list = myString.toCharArray();
        
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 'A') {
                list[i] = 'B';
            } else {
                list[i] = 'A';
            }
        }
        
        if (String.valueOf(list).contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}