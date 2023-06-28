class Solution {
    public int solution(String binomial) {
        String[] list = binomial.split(" ");
        
        int a = Integer.parseInt(list[0]);
        String op = list[1];
        int b = Integer.parseInt(list[2]);
        
        if (op.equals("+")) {
            return a + b;
        } else if (op.equals("-")) {
            return a - b;
        } else {
            return a * b;
        }
    }
}