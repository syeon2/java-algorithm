import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] list = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(list);
        
        int ans = list[0];
        for (int i = 1; i < N; i++) {
            list[i] = list[i - 1] + list[i];
            
            ans += list[i];
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}