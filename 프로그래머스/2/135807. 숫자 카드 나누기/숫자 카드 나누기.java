class Solution {
    public int solution(int[] arrayA, int[] arrayB) {

        int factorA = arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {
            factorA = gcd(factorA, arrayA[i]);
        }

        int factorB = arrayB[0];
        for (int i = 0; i < arrayB.length; i++) {
            factorB = gcd(factorB, arrayB[i]);
        }

        int ans = 0;

        if (factorA != 1) {
            boolean isExist = true;

            for (int i = 0; i < arrayB.length; i++) {
                if (arrayB[i] % factorA == 0) isExist = false;
            }

            if (isExist) ans = Math.max(ans, factorA);
        }
        
        if (factorB != 1) {
            boolean isExist = true;

            for (int i = 0; i < arrayA.length; i++) {
                if (arrayA[i] % factorB == 0) isExist = false;
            }

            if (isExist) ans = Math.max(ans, factorB);
        }

        return ans;
    }
    
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}