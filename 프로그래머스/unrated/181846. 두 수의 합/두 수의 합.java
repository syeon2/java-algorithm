import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger a1 = new BigInteger(a);
        BigInteger a2 = new BigInteger(b);
        
        return String.valueOf(a1.add(a2));
    }
}