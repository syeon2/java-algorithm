class Solution {
    public long solution(int k, int d) {
        long cnt = 0;
        
        long x = 0;
        
        while (true) {
            long x2 = ((long) x * k) * ((long) x * k);
            long d2 = (long) d * d;
            
            if (x2 > d2) break;
            
            long sub = (long) Math.sqrt(d2 - x2);
            sub /= k;
            
            cnt += sub + 1;
            
            x += 1;
        }
        
        return cnt;
    }
}