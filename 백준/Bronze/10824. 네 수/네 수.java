import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());
        long d = Integer.parseInt(st.nextToken());
        
        long ab = Long.parseLong(a + "" + b);
        long cd = Long.parseLong(c + "" + d);
        
        bw.write(String.valueOf(ab + cd));
        bw.flush();
        bw.close();
    }
}