import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> map = new HashMap<>();
        String[] list = new String[N + 1];
        
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            
            map.put(name, i);
            list[i] = name;
        }
        
        for (int m = 0; m < M; m++) {
            String cmd = br.readLine();
            
            if (cmd.charAt(0) >= '0' && cmd.charAt(0) <= '9') {
                int idx = Integer.parseInt(cmd);
                
                sb.append(list[idx]).append("\n");
            } else {
                int idx = map.get(cmd);
                
                sb.append(idx).append("\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}