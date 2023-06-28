class Solution {
    public int solution(int n, String control) {
        String[] list = control.split("");
        
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals("w")) {
                n += 1;
            } else if (list[i].equals("s")) {
                n -= 1;
            } else if (list[i].equals("d")) {
                n += 10;
            } else {
                n -= 10;
            }
        }
        
        return n;
    }
}