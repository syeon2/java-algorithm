import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if (a == 0 && b == 0) break;
            
            if (a < b && b % a == 0) sb.append("factor");
            else if (b < a && a % b == 0) sb.append("multiple");
            else sb.append("neither");
            
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}