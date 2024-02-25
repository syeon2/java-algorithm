import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int min = Integer.MAX_VALUE;
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
            
            min = Math.min(min, list[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= min; i++) {
            boolean flag = true;
            
            for (int k = 0; k < list.length; k++) {
                if (list[k] % i > 0) flag = false;
            }
            
            if (flag) sb.append(i).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}