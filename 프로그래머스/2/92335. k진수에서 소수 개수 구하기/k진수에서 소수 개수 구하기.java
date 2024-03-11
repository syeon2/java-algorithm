import java.util.*;

class Solution {
    public int solution(int n, int k) {
        String transNum = Integer.toString(n, k);

        String[] numList = Arrays.stream(transNum.split("0"))
                .filter(s -> !s.isBlank())
                .toArray(String[]::new);

        int ans = 0;
        for (String s : numList) {
            long num = Long.parseLong(s);

            if (checkPrime(num)) ans++;
        }

        return ans;
    }

    public boolean checkPrime(long num) {
        if (num <= 1) return false;
        else if (num == 2 || num == 3) return true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}