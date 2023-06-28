class Solution {
    public int solution(String my_string, String is_suffix) {
        StringBuilder sb = new StringBuilder();
        
        if (sb.append(my_string).toString().endsWith(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
    }
}