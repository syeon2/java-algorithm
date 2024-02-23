import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] list = br.readLine().split(" ");
        
        String A = list[0];
        String B = list[1];
        
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= B.length() - A.length(); i++) {
            
            int cnt = 0;
            for (int k = 0; k < A.length(); k++) {
                if (A.charAt(k) != B.charAt(i + k)) cnt++;
            }
            
            ans = Math.min(cnt, ans);
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}