import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] list = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            int temp = 0;
            
            for (int k = i; k < N; k++) {
                temp += list[k];
                
                if (M < temp) break;
                else if (M == temp) {
                    ans++;
                    break;
                }
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}