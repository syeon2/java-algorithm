import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] list = new int[42];
        
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            
            list[num % 42]++;
        }
        
        int ans = 0;
        for (int i = 0; i < 42; i++) {
            if (list[i] >= 1) ans++;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}