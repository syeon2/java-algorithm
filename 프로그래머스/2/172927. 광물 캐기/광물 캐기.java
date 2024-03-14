class Solution {
    
    public int DIA_PICK = 25;
    public int IRON_PICK = 5;
    public int STONE_PICK = 1;
    
    public int solution(int[] picks, String[] minerals) {
        int sectionLen = minerals.length / 5;
        if (minerals.length % 5 > 0) sectionLen += 1;
        
        int[] section = new int[sectionLen];
        
        for (int i = 0; i < minerals.length; i++) {
            int idx = i / 5;
            
            if (minerals[i].equals("diamond")) section[idx] += DIA_PICK;
            else if (minerals[i].equals("iron")) section[idx] += IRON_PICK;
            else section[idx] += STONE_PICK;
        }
        
        int pickIdx = 0;
        int tired = 0;
        
        int totalPick = 0;
        for (int i = 0; i < 3; i++) {
            totalPick += picks[i];
        }
        
        for (int i = totalPick; i < sectionLen; i++) {
            section[i] = 0;
        }
        
        while (true) {
            pickIdx = getPick(picks);
            if (pickIdx == -1) break;
            
            int maxSectionIdx = -1;
            int maxSection = 0;
            
            for (int i = 0; i < sectionLen; i++) {
                if (section[i] > maxSection) {
                    maxSection = section[i];
                    maxSectionIdx = i;
                }
            }
            
            if (maxSection == 0) break;
            else section[maxSectionIdx] = 0;
            
            int start = maxSectionIdx * 5;
            int end = Math.min(maxSectionIdx * 5 + 5, minerals.length);
            
            for (int i = start; i < end; i++) {
                if (pickIdx == 0) tired += 1;
                else if (pickIdx == 1) {
                    if (minerals[i].equals("diamond")) tired += 5;
                    else tired += 1;
                } else {
                    if (minerals[i].equals("diamond")) tired += 25;
                    else if (minerals[i].equals("iron")) tired += 5;
                    else tired += 1;
                }
            }
        }
        
        return tired;
    }
    
    public int getPick(int[] picks) {
        for (int i = 0; i < 3; i++) {
            if (picks[i] > 0) {
                picks[i] -= 1;
                return i;
            }
        }
        
        return -1;
    }
}