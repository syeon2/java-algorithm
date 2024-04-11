import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(list);
        
        int ans = Integer.MIN_VALUE;
        
        for (int i = 0; i < N; i++) {            
            ans = Math.max(ans, list[i] * (N - i));
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}