import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] list = new int[4];
        list[1] = 1;
        
        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            int temp = list[a];
            list[a] = list[b];
            list[b] = temp;
        }
        
        int ans = -1;
        for (int i = 1; i <= 3; i++) {
            if (list[i] == 1) ans = i;
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}