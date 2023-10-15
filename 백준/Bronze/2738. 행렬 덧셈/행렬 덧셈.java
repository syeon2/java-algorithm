import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int[][] list = new int[A][B];
        
        for (int i = 0; i < A; i++) {
            
            st = new StringTokenizer(br.readLine(), " ");
            for (int k = 0; k < B; k++) {
                list[i][k] = Integer.parseInt(st.nextToken());
            }
        }
        
        for (int i = 0; i < A; i++) {
            
            st = new StringTokenizer(br.readLine(), " ");
            
            for (int k = 0; k < B; k++) {
                list[i][k] += Integer.parseInt(st.nextToken());
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < A; i++) {
            
            for (int k = 0; k < B; k++) {
                sb.append(list[i][k]).append(" ");
            }
            
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}