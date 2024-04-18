import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int[] list = {a, b, c};
        Arrays.sort(list);
        
        if (list[2] < list[0] + list[1]) bw.write(String.valueOf(list[0] + list[1] + list[2]));
        else bw.write(String.valueOf((list[0] + list[1]) * 2 - 1));
        
        bw.flush();
        bw.close();
    }
}