import java.util.Arrays;

class Solution {
    public int solution(String[][] book_time) {
        int customer = 0;
        
        for (int i = 0; i < 1440; i++) {
            int cnt = 0;
            
            for (int k = 0; k < book_time.length; k++) {
                int startTime = getTime(book_time[k][0]);
                int endTime = getTime(book_time[k][1]) + 9;
                
                if (startTime <= i && endTime >= i) cnt++;
            }
            
            if (customer < cnt) customer = cnt;
        }
        
        return customer;
    }
    
    public int getTime(String time) {
        Integer[] times = Arrays.stream(time.split(":"))
            .map(Integer::parseInt)
            .toArray(Integer[]::new);
        
        int hour = times[0];
        int minute = times[1];
        
        int totalMinute = (60 * hour) + minute;
        
        return totalMinute;
    }
}