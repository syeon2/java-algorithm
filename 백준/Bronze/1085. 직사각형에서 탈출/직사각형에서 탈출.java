import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int minX = Math.min(Math.abs(x), Math.abs(a - x));
        int minY = Math.min(Math.abs(y), Math.abs(b - y));
        
        bw.write(String.valueOf(Math.min(minX, minY)));
        bw.flush();
        bw.close();
    }
}