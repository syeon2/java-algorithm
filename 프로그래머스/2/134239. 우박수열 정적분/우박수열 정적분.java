import java.util.*;

class Solution {
    public double[] solution(int k, int[][] ranges) {
        int[] kList = getCollatz(k);
        
        int width = kList.length;
        
        double[] areas = new double[width];
        
        for (int i = 1; i < width; i++) {
            double area = getArea(kList[i - 1], kList[i]);
            
            areas[i] = areas[i - 1] + area;
        }
        
        double[] ans = new double[ranges.length];
        
        for (int i = 0; i < ranges.length; i++) {
            int x1 = ranges[i][0];
            int x2 = width + ranges[i][1] - 1;
            
            if (x1 > x2) ans[i] = -1.0;
            else ans[i] = areas[x2] - areas[x1];
        }
        
        return ans;
    
    }
    
    public double getArea(int left, int right) {
        int subHeight = Math.abs(left - right);
        
        double area = (double) Math.min(left, right) + ((double) subHeight / 2);
        
        return area;
    }
    
    public int[] getCollatz(int k) {
        List<Integer> arr = new ArrayList<>();

        arr.add(k);

        while (k > 1) {
            if (k % 2 == 0) {
                k /= 2;
                arr.add(k);
            } else {
                k = (k * 3) + 1;
                arr.add(k);
            }
        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}