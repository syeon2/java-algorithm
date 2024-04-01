import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int cnt = Integer.parseInt(st.nextToken());
            char[] list = st.nextToken().toCharArray();
            
            for (int i = 0; i < list.length; i++) {
                int temp = cnt;
                while (temp-- > 0) {
                    sb.append(list[i]);
                }
            }
            
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}