import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String ans = "";
        
        int num = Integer.parseInt(st.nextToken());
        
        if (num == 1) {
            boolean pass = true;
            for (int i = 0; i < 7; i++) {
                int newNum = Integer.parseInt(st.nextToken());
                
                if (num > newNum) {
                    ans = "mixed";
                    pass = false;
                    break;
                }
                num = newNum;
            }
            
            if (pass) ans = "ascending";
        } else if (num == 8) {
            boolean pass = true;
            for (int i = 0; i < 7; i++) {
                int newNum = Integer.parseInt(st.nextToken());
                
                if (num < newNum) {
                    ans = "mixed";
                    pass = false;
                    break;
                }
                num = newNum;
            }
            
            if (pass) ans = "descending";
        } else ans = "mixed";
        
        bw.write(ans);
        bw.flush();
        bw.close();
    }
}