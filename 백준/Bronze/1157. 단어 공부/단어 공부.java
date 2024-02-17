import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[] list = br.readLine().toCharArray();
        
        int[] alp = new int[26];
        for (int i = 0; i < list.length; i++) {
            if (list[i] >= 'a' && list[i] <= 'z') {
                int idx = list[i] - 'a';
                
                alp[idx]++;
            } else {
                int idx = list[i] - 'A';
                
                alp[idx]++;
            }
        }
        
        int max = 0;
        int idx = -1;
        int cnt = 0;
        
        for (int i = 0; i < alp.length; i++) {
            if (max < alp[i]) {
                max = alp[i];
                idx = i;
                cnt = 1;
            } else if (max == alp[i]) cnt++;
        }
        
        if (cnt >= 2) bw.write("?");
        else bw.write(String.valueOf((char) (idx + 'A')));
        
        bw.flush();
        bw.close();
    }
}