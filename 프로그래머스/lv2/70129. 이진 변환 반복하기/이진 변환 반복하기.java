class Solution {
    public int[] solution(String s) {
        int changed = 0;
        int removeZero = 0;
        
        String str = s;
        while (!str.equals("1")) {
            StringBuilder sb = new StringBuilder();
            
            String[] list = str.split("");
            for (int i = 0; i < list.length; i++) {
                if (list[i].equals("1")) sb.append("1");
                else removeZero += 1;
            }
            
            int len = sb.toString().length();
            
            str = Integer.toBinaryString(len);
            changed++;
        }
        
        int[] answer = new int[2];
        answer[0] = changed;
        answer[1] = removeZero;
        
        return answer;
    }
}