class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        
        StringBuilder sb = new StringBuilder();
        char[] list = new_id.toCharArray();
        for (int i = 0; i < list.length; i++) {
            char c = list[i];
            
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                sb.append(String.valueOf(c));
            }
        }
        
        String str = sb.toString();
        while (str.contains("..")) {
            str = str.replace("..", ".");
        }
        
        if (str.length() > 0) {
            if (str.charAt(0) == '.') str = str.substring(1);   
        }
        
        if (str.length() > 0) {
            if (str.charAt(str.length() - 1) == '.') str = str.substring(0, str.length() - 1);   
        }
        
        if (str.equals("")) str = "a";
        
        if (str.length() >= 16) {
            str = str.substring(0, 15);
            
            if (str.charAt(str.length() - 1) == '.') str = str.substring(0, str.length() - 1);
        }
        
        
        if (str.length() <= 2) {
            while (str.length() != 3) {
                str = str + String.valueOf(str.charAt(str.length() - 1));
            }
        }
        
        return str;
    }
}