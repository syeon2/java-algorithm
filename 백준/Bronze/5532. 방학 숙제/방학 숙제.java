import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int L = Integer.parseInt(br.readLine());
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        
        while (true) {
            if (A <= 0 && B <= 0) break;
            
            L--;
            
            A -= C;
            B -= D;
        }
        
        bw.write(String.valueOf(L));
        bw.flush();
        bw.close();
    }
}