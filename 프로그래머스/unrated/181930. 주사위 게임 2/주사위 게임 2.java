class Solution {
    public int solution(int a, int b, int c) {
        if (a != b && a != c && b != c) {
            return a + b + c;
        } else if (a == b && b == c) {
            int one = a + b + c;
            int two = (a * a) + (b * b) + (c * c);
            int three = (a * a * a) + (b * b * b) + (c * c * c);
            
            return one * two * three;
        } else {
            int one = a + b + c;
            int two = a * a + b * b + c * c;
            
            return one * two;
        }
    }
}