import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int cnt = 0;
        for (int n = 0; n < N; n++) {
            String str = br.readLine();
            
            if (check(str)) cnt++;
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
    
    public static boolean check(String str) {
        boolean[] cList = new boolean[26];
        char[] sList = str.toCharArray();
        
        char curC = sList[0];
        cList[curC - 'a'] = true;
        
        for (int i = 1; i < sList.length; i++) {
            if (sList[i] == curC) continue;
            else {
                int idx = sList[i] - 'a';
                
                if (cList[idx]) return false;
                else {
                    cList[idx] = true;
                    curC = sList[i];
                }
            }
        }
        
        return true;
    }
}