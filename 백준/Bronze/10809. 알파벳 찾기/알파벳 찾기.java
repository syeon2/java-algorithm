import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[] list = br.readLine().toCharArray();
        int[] alp = new int[26];
        Arrays.fill(alp, -1);
        
        for (int i = 0; i < list.length; i++) {
            int idx = list[i] - 'a';
            
            if (alp[idx] == -1) alp[idx] = i;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alp.length; i++) {
            sb.append(alp[i]).append(" ");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}