import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(list);
        
        for (int i = 0; i < list.length; i++) {
            sb.append(list[i]).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}