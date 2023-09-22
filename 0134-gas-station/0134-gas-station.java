class Solution {
    // Definition
    /*
    1. 1차원 배열로 가스 충전, 비용이 주어진다.
    2. 가스 충전 배열은 그 인덱스에 접근하면 가스를 충전할 수 있는 양이 요소로 있으며
    비용은 다음 칸으로 갈 때 소요되는 가스의 양이 요소로 있다.
    3. 시계방향으로 움직인다고 가정할 때, 시작한 인덱스로부터 움직여 한바퀴 순환이 가능한지의 여부를 판단하고 
    가능하면 시작 인덱스를, 불가능하면 -1을 반환하는 문제이다.
    */

    // Abstraction - 문제 구조화
    /*
    1. 해당 문제를 분석해보자.
    2. 먼저 해당 문제의 조건은 
        - 아무 인덱스에서 출발이 가능하다.
        - 순환을 하려면 방문 인덱스마다 보유한 gas 총 양이 0보다 커야한다.
        - 모든 인덱스를 순환하면 가스 보유양은 0 이상이어야 한다.
    3. 각 인덱스를 방문하면서 현재 가스량이 얼마인지 체크하고, 가스 양이 가장 많은 시점을 캐싱할 수 있는
        변수를 만들어 현재 방문 시기 때의 가스량과 최고점 가스량을 비교하여 갱신한다.
    4. 순환은 오른쪽으로 진행되기 때문에, 역순환하면서 가스량을 체크한다.
        -> 가스량이 최고점인 시점은 진행 방향에 따라 달라지기 때문에다.
    */

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int temp = 0;
        int index = -1;

        for (int i = gas.length - 1; i >= 0; i--) {
            if (totalGas <= temp + gas[i] - cost[i]) {
                totalGas = temp + gas[i] - cost[i];
                index = i;
            }

            temp += gas[i] - cost[i];
        }

        if (temp < 0) return -1;
        else return index;
    }
}