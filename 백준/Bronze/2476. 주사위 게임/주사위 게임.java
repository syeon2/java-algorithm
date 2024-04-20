import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int ans = 0;
        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int[] list = new int[3];
            for (int i = 0; i < 3; i++) {
                list[i] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(list);
            
            if (list[0] == list[1] && list[1] == list[2]) {
                ans = Math.max(ans, 10000 + (list[0] * 1000));
            } else if (list[0] == list[1] && list[1] != list[2]) {
                ans = Math.max(ans, 1000 + (list[0] * 100));
            } else if (list[0] == list[2] && list[0] != list[1]) {
                ans = Math.max(ans, 1000 + (list[0] * 100));
            } else if (list[1] == list[2] && list[0] != list[1]) {
                ans = Math.max(ans, 1000 + (list[1] * 100));
            } else ans = Math.max(ans, list[2] * 100);
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}