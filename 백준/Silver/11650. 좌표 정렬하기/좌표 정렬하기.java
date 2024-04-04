import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        int[][] list = new int[N][2];
            
        for (int n = 0; n < N; n++) {
            st = new StringTokenizer(br.readLine());
            
            list[n][0] = Integer.parseInt(st.nextToken());
            list[n][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(list, new Comparator<>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                
                return a[0] - b[0];
            }
        });
        
        for (int n = 0; n < N; n++) {
            sb.append(list[n][0]).append(" ").append(list[n][1]).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}