import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] list = new int[11];
        for (int i = 1; i <= 10; i++) {
            list[i] = Integer.parseInt(br.readLine()) + list[i - 1];
        }
        
        int ans = 0;
        int sub = Integer.MAX_VALUE;
        for (int i = 1; i <= 10; i++) {
            if (Math.abs(list[i] - 100) <= sub) {
                ans = list[i];
                sub = Math.abs(list[i] - 100);
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}