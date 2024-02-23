import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        int aCut = 15;
        int bCut = 28;
        int cCut = 19;
        
        
        int aN = 1;
        int bN = 1;
        int cN = 1;
        
        int y = 1;
        
        while (!(aN == A && bN == B && cN == C)) {
            y++;
            aN++;
            bN++;
            cN++;
            
            if (aN > aCut) aN = 1;
            if (bN > bCut) bN = 1;
            if (cN > cCut) cN = 1;
        }
        
        bw.write(String.valueOf(y));
        bw.flush();
        bw.close();
    }
}