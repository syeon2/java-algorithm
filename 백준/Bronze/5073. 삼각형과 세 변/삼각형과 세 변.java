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
            int c = Integer.parseInt(st.nextToken());
            
            if (a == 0 && b == 0 && c == 0) break;
            
            int[] list = {a, b, c};
            Arrays.sort(list);
            
            if (list[2] >= list[0] + list[1]) sb.append("Invalid").append("\n");
            else if (a == b && b == c) sb.append("Equilateral").append("\n");
            else if (a != b && b != c && a != c) sb.append("Scalene").append("\n");
            else sb.append("Isosceles").append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}