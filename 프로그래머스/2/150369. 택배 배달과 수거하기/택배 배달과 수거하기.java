import java.util.*;

class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        
        long answer = 0;
        
        Stack<Parcel> delStack = new Stack<>();
        Stack<Parcel> pickStack = new Stack<>();
        
        for (int i = 0 ; i < deliveries.length; i++){
            if (deliveries[i] > 0) delStack.add(new Parcel(deliveries[i], i + 1));
            if (pickups[i] > 0) pickStack.add(new Parcel(pickups[i], i + 1));
        }
        
        while (!delStack.isEmpty() || !pickStack.isEmpty()) {
            int sum = 0;
            int dist = 0;
            
            while (!delStack.isEmpty() && sum < cap) {
                Parcel parcel = delStack.pop();
                dist = Math.max(dist, parcel.dist);
                
                if (parcel.count + sum <= cap) {
                    sum += parcel.count;
                } else {
                    parcel.count -= (cap - sum);
                    delStack.add(parcel);
                    break;
                }
            }
            
            sum = 0;
            while (!pickStack.isEmpty() && sum < cap){
                Parcel parcel = pickStack.pop();
                dist = Math.max(dist, parcel.dist);
                
                if (parcel.count + sum <= cap) {
                    sum += parcel.count;
                } else {
                    parcel.count -= (cap - sum);
                    pickStack.add(parcel);
                    break;
                }
            }
            
            answer += (dist * 2);
        }
        
        return answer;
    }
    
    public class Parcel {
        public int count;
        public int dist;
        
        public Parcel(int count, int dist) {
            this.count = count;
            this.dist = dist;
        }
    }
}