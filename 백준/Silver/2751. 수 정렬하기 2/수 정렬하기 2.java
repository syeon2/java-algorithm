import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(list);
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            sb.append(list[i]).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}