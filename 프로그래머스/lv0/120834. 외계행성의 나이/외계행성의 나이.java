class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        char[] list = String.valueOf(age).toCharArray();
        
        for (int i = 0; i < list.length; i++) {
            if (list[i] == '0') sb.append("a");
            else if (list[i] == '1') sb.append("b");
            else if (list[i] == '2') sb.append("c");
            else if (list[i] == '3') sb.append("d");
            else if (list[i] == '4') sb.append("e");
            else if (list[i] == '5') sb.append("f");
            else if (list[i] == '6') sb.append("g");
            else if (list[i] == '7') sb.append("h");
            else if (list[i] == '8') sb.append("i");
            else if (list[i] == '9') sb.append("j");
        }
        
        return sb.toString();
    }
}