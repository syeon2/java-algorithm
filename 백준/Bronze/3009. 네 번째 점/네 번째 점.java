import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] xList = new int[1001];
        int[] yList = new int[1001];
        
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            
            xList[X]++;
            yList[Y]++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= 1000; i++) {
            if (xList[i] == 1) sb.append(i).append(" ");
        }
        
        for (int i = 1; i <= 1000; i++) {
            if (yList[i] == 1) sb.append(i);
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}