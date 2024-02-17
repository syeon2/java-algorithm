import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int m = Integer.parseInt(br.readLine());
        
        // 분 처리
        M += m;
        
        // 시간 더하기
        H += M / 60;
        M %= 60;
        
        H %= 24;
        
        bw.write(String.valueOf(H));
        bw.write(" ");
        bw.write(String.valueOf(M));
        
        bw.flush();
        bw.close();
    }
}