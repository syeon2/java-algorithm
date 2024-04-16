import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int[] totalList = new int[A + B];
        
        int idx = 0;
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            
            if (i == 0) {
                for (int k = 0; k < A; k++) {
                    totalList[idx++] = Integer.parseInt(st.nextToken());
                }
            } else {
                for (int k = 0; k < B; k++) {
                    totalList[idx++] = Integer.parseInt(st.nextToken());
                }
            }
        }
        
        Arrays.sort(totalList);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < totalList.length; i++) {
            sb.append(totalList[i]).append(" ");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}