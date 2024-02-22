import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] dx = new int[1001];
        int[] dy = new int[1001];
        
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            dx[x]++;
            dy[y]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1001; i++) {
            if (dx[i] == 1) {
                sb.append(i).append(" ");
                break;
            }
        }
        
        for (int i = 0; i < 1001; i++) {
            if (dy[i] == 1) {
                sb.append(i);
                break;
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}