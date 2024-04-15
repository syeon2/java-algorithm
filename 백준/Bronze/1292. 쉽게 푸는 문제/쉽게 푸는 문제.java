import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int[] list = new int[1000001];
        
        int idx = 1;
        for (int i = 1; i <= B; i++) {
            for (int k = 1; k <= i; k++) {
                list[idx++] = i;
            }
        }
        
        int ans = 0;
        for (int i = A; i <= B; i++) {
            ans += list[i];
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}