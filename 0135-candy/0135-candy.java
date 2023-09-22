class Solution {
    // Definition
    /*
    1. 각 어린이들의 점수를 보여주는 rating점수를 1차원 배열 방식으로 제공받는다.
    2. 모든 어린이들은 최소 한개의 사탕을 받아야한다.
    3. 점수가 높은 어린이는 인접한 다른 어린이보다 사탕받는 개수가 많아야한다.
    4. 위의 조건을 만족하면서 최소로 필요한 사탕 총 개수를 구하시오.
    */

    // Abstraction
    /*
    1. 모든 어린이는 사탕을 한개씩 받아야한다.
    2. 사탕은 최소 한개씩 제공받아야하기 때문에 모든 인덱스에 1씩 제공한다.
    3. 먼저 오른쪽 방향으로 순환하면서 인덱스가 n일 때, n - 1의 점수와 비교한다.
        비교 후 현재 N값이 크다면 n - 1에 캐싱한 사탕 수에서 +1을 한다.
    4. 3번을 모든 인덱스에서 진행한 후, 다시 왼쪽방향으로 순환하면서 N일 때 N + 1의 점수와 비교한다.
        비교 후 현재 N값이 크다면 이미 캐싱되어 있는 사탕 개수와 (N + 1) 에 캐싱되어 있는 사탕 개수 + 1과 비교하고
        큰 값으로 갱신한다. (큰 값으로 갱신하는 이유는 양방향에서 꼭 필요한 개수가 최대 개수가 되기 때문이다.) 
    5. 3, 4번을 마쳤으면 캐싱되어 있는 사탕 개수를 모두 더해 반환한다.
    */

    public int candy(int[] ratings) {
        
        int[] cache = new int[ratings.length];

        cache[0] = 1;
        for (int i = 1; i < cache.length; i++) {
            cache[i] = 1;

            if (ratings[i - 1] < ratings[i]) {
                cache[i] = cache[i - 1] + 1;
            }
        }

        for (int i = cache.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                cache[i] = Math.max(cache[i], cache[i + 1] + 1);
            }
        }

        int totalCandies = 0;

        for (int i = 0; i < cache.length; i++) {
            totalCandies += cache[i];
        }

        return totalCandies;
    }
}