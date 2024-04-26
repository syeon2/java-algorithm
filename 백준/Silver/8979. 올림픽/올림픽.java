import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()) - 1;
        
        int[][] list = new int[N][3];
        
        for (int n = 0; n < N; n++) {
            st = new StringTokenizer(br.readLine());
            
            int con = Integer.parseInt(st.nextToken()) - 1;
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());
            
            list[con][0] = gold;
            list[con][1] = silver;
            list[con][2] = bronze;
        }
        
        int ans = 1;
        
        int[] country = list[K];
        for (int i = 0; i < N; i++) {
            if (country[0] < list[i][0]) ans++;
            else if (country[0] == list[i][0] && country[1] < list[i][1]) ans++;
            else if (country[0] == list[i][0] && country[1] == list[i][1] && country[2] < list[i][2]) ans++;
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}