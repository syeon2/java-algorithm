import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int N = Integer.parseInt(st.nextToken());
        
        boolean ans = false;
        
        int aCnt = 0;
        while (aCnt * a <= N) {
            
            int bCnt = 0;
            while ((aCnt * a) + (bCnt * b) <= N) {
                
                int cCnt = 0;
                
                while ((aCnt * a) + (bCnt * b) + (cCnt * c) <= N) {
                    
                    if ((aCnt + a) + (bCnt * b) + (cCnt * c) == N) {
                        ans = true;
                        break;
                    }
                    
                    cCnt++;
                }
                
                if (ans) break;
                bCnt++;
            }
            
            if (ans) break;
            aCnt++;
        }
        
        if (ans) bw.write("1");
        else bw.write("0");
        
        bw.flush();
        bw.close();
    }
}