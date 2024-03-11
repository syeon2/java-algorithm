import java.math.BigInteger;

class Solution {
    public int solution(int n, int k) {
        String str = convertNotation(n, k);

        int ans = 0;

        int prevIdx = -1;
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0' && prevIdx == -1 && cnt > 0) {
                String substring = str.substring(0, i);

                BigInteger subNum = new BigInteger(substring);

                if (subNum.isProbablePrime(10)) {
                    ans++;
                    prevIdx = i;
                    cnt = 0;
                } else {
                    prevIdx = i;
                    cnt = 0;
                }
            } else if (str.charAt(i) == '0' && cnt > 0) {
                String substring = str.substring(prevIdx + 1, i);

                BigInteger subNum = new BigInteger(substring);

                if (subNum.isProbablePrime(10)) {
                    ans++;
                    prevIdx = i;
                    cnt = 0;
                } else {
                    prevIdx = i;
                    cnt = 0;
                }
            } else cnt++;
        }

        if (cnt > 0) {
            String substring = str.substring(prevIdx + 1);

            BigInteger subNum = new BigInteger(substring);

            if (subNum.isProbablePrime(10)) ans++;
        }

        return ans;
    }
    
        public String convertNotation(int n, int k) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int temp = n % k;

            sb.insert(0, temp);

            n /= k;
        }

        return sb.toString();
    }
}