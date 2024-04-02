import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int ans = 0;
        
        for (int n = 0; n < N; n++) {
            char[] list = br.readLine().toCharArray();
            
            boolean isNot = false;
            boolean[] alp = new boolean[26];
            int curChar = 0;
            
            for (int i = 0; i < list.length; i++) {
                if (curChar != list[i] && !alp[list[i] - 'a']) {
                    curChar = list[i];
                    alp[list[i] - 'a'] = true;
                } else if (curChar != list[i] && alp[list[i] - 'a']) {
                    isNot = true;
                    break;
                }
            }
            
            if (!isNot) ans++;
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}