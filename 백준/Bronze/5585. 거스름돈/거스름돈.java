import java.io.*;

public class Main {
    public static int[] list = {500, 100, 50, 10, 5, 1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = 1000 - Integer.parseInt(br.readLine());

        int ans = 0;
        for (int i = 0; i < 6; i++) {
            ans += N / list[i];
            N = N % list[i];
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}