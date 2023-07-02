class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        while (true) {
            if (((a - 1) / 4 == (b - 1) / 4)) {
                
                if ((a - 1) / 2 == (b - 1) / 2) {
                    break;
                } else {
                    a = getNextNum(a);
                    b = getNextNum(b);

                    answer++;
                }
            } else {

                
                a = getNextNum(a);
                b = getNextNum(b);

                answer++;   
            }
        }

        return answer;
    }
    
    public int getNextNum(int n) {
        if (n % 2 == 1) return (n / 2) + 1;
        else return n / 2;
    }
}