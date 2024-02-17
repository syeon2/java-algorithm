import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int five = 0;
        
        int ans = -1;
        while (true) {
            if (five * 5 > N) break;
            
            int temp = N - (five * 5);
            
            if (temp % 3 == 0) ans = five + (temp / 3);
            
            five++;
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}