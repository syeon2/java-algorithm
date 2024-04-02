import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        for (int n = 0; n < N; n++) {
            char[] list = br.readLine().toCharArray();
            boolean isNormal = true;
            
            int stack = 0;
            for (char c : list) {
                if (c == '(') stack++;
                else {
                    if (stack == 0) isNormal = false;
                    else stack--;
                }
            }
            
            if (stack > 0) isNormal = false;
            
            if (isNormal) sb.append("YES");
            else sb.append("NO");
            
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}