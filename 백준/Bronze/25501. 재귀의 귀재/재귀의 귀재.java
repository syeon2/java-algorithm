import java.io.*;

public class Main {
    
    public static int ans = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        for (int n = 0; n < N; n++) {
            String str = br.readLine();
            
            int cnt = 0;
            
            int l = 0;
            int r = str.length() - 1;
            
            boolean isFal = true;
            
            while (true) {
                cnt++;
                
                if (l >= r) break;
                
                if (str.charAt(l) != str.charAt(r)) {
                    isFal = false;
                    break;
                }
                
                l += 1;
                r -= 1;
            }
            
            if (isFal) sb.append(1).append(" ");
            else sb.append(0).append(" ");
            
            sb.append(cnt).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}