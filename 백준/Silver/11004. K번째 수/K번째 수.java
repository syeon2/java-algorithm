import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int[] list = new int[A];
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < A; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(list);
        
        bw.write(String.valueOf(list[B - 1]));
        bw.flush();
        bw.close();
    }
}