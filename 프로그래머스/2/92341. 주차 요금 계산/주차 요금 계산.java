import java.util.StringTokenizer;
import java.util.TreeMap;

class Solution {
    
    public TreeMap<String, Integer> inMap = new TreeMap<>();
    public TreeMap<String, Integer> outMap = new TreeMap<>();
    
    public int[] solution(int[] fees, String[] records) {
        int baseTime = fees[0];
        int baseCost = fees[1];
        int extraTime = fees[2];
        int surcharge = fees[3];

        for (int i = 0; i < records.length; i++) {
            StringTokenizer st = new StringTokenizer(records[i]);

            String[] allTime = st.nextToken().split(":");
            int curTime = (60 * Integer.parseInt(allTime[0])) + Integer.parseInt(allTime[1]);

            String carNumber = st.nextToken();
            String info = st.nextToken();

            if (info.equals("IN")) {
                inMap.put(carNumber, curTime);
            } else {
                Integer inTime = inMap.get(carNumber);

                if (outMap.containsKey(carNumber)) outMap.put(carNumber, outMap.get(carNumber) + (curTime - inTime));
                else outMap.put(carNumber, curTime - inTime);

                inMap.remove(carNumber);
            }
        }

        int lastTime = (60 * 23) + 59;
        for (String key : inMap.keySet()) {
            int inTime = inMap.get(key);

            if (outMap.containsKey(key)) outMap.put(key, outMap.get(key) + (lastTime - inTime));
            else outMap.put(key, lastTime - inTime);
        }

        int[] ans = new int[outMap.size()];
        int idx = 0;
        for (String key : outMap.keySet()) {
            int totalTime = outMap.get(key);

            if (totalTime <= baseTime) ans[idx++] = baseCost;
            else {
                ans[idx] = baseCost;
                ans[idx] += (totalTime - baseTime) / extraTime * surcharge;
                if ((totalTime - baseTime) % extraTime > 0) ans[idx] += surcharge;

                idx++;
            }
        }
        
        return ans;
    }
}