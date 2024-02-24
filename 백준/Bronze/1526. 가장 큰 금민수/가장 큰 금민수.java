import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int max = 0;
        
        for (int i = 4; i <= N; i++) {
            if (isGum(i)) max = i;
        }
        
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
    
    public static boolean isGum(int n) {
        while (n > 0) {
            if (!(n % 10 == 4 || n % 10 == 7)) return false;
            
            n /= 10;
        }
        
        return true;
    }
}