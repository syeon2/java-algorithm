import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        if (m >= 45) m -= 45;
        else {
            if (h == 0) h = 23;
            else h -= 1;
            
            m = 60 + (m - 45);
        }
        
        System.out.println(h + " " + m);
    }
}