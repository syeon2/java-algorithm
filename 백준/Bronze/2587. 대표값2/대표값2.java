import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] list = new int[5];
        for (int i = 0; i < 5; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(list);
        
        int avg = 0;
        for (int i = 0; i < 5; i++) {
            avg += list[i];
        }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(avg / 5).append("\n").append(list[2]);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}