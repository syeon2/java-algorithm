import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        if (N == 0) {
            bw.write("0");
        } else {
            int n0 = 0;
            int n1 = 1;
            
            while (N-- > 1) {
                int temp = n0;
            
                n0 = n1;
                n1 = temp + n1;
            }
        
            bw.write(String.valueOf(n1));
        }
        
        bw.flush();
        bw.close();
    }
}