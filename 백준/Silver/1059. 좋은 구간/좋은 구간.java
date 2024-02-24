import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        
        int n = Integer.parseInt(br.readLine());
        
        int min = 0;
        int max = Integer.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            if (n >= list[i] && min <= list[i]) min = list[i];
            if (n <= list[i] && max >= list[i]) max = list[i];
        }
        
        if (min == n) bw.write("0");
        else {
            int start = n - (min + 1);
            int middle = max - n;
            
            int end = max - 1 - n;
            
            bw.write(String.valueOf((start * middle) + end));
        }
        
        bw.flush();
        bw.close();
    }
}