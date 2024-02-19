import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        if ((A >= B && A <= C) || (A >= C && A <= B)) bw.write(String.valueOf(A));
        else if ((B >= A && B <= C) || (B >= C && B <= A)) bw.write(String.valueOf(B));
        else bw.write(String.valueOf(C));
        
        bw.flush();
        bw.close();
    }
}