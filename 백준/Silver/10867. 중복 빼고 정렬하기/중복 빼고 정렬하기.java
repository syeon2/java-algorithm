import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i : set) {
            sb.append(i).append(" ");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}