import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        
        int total = 0;
        int pos = 1;
        
        while (b > 0) {
            int temp = b % 10;
            
            bw.write(String.valueOf(a * temp));
            bw.newLine();
            
            total += (a * temp) * pos;
            pos *= 10;
            b /= 10;
        }
        
        bw.write(String.valueOf(total));
        
        bw.flush();
        bw.close();
    }
}
