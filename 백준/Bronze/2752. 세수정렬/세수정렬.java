import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[3];
        for (int i = 0; i < 3; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(list[i]).append(" ");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}