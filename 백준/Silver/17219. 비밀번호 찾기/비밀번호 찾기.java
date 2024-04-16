import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<String, String> map = new HashMap<>();
        
        for (int n = 0; n < N; n++) {
            st = new StringTokenizer(br.readLine());
            
            String site = st.nextToken();
            String password = st.nextToken();
            
            map.put(site, password);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int m = 0; m < M; m++) {
            String site = br.readLine();
            
            sb.append(map.get(site)).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}