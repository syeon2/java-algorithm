import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] list = new int[N];
        int M = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
            if (M < list[i]) M = list[i];
        }
        
        double avg = 0;
        
        for (int i = 0; i < N; i++) {
            avg += ((double) list[i] / M * 100);
        }
        
        avg /= N;
        
        bw.write(String.valueOf(avg));
        bw.flush();
        bw.close();
    }
}