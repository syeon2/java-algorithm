import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int n = 0; n < N; n++) {
            char[] list = br.readLine().toCharArray();
            
            int cnt = 0;
            boolean flag = true;
            
            for (int i = 0; i < list.length; i++) {
                if (list[i] == '(') cnt++;
                else cnt--;
                
                if (cnt < 0) {
                    flag = false;
                    break;
                }
            }
            
            if (cnt == 0 && flag) sb.append("YES\n");
            else sb.append("NO\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}