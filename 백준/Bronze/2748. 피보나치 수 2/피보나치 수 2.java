import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        long[] list = new long[N + 1];
        list[1] = 1;
        
        for (int i = 2; i <= N; i++) {
            list[i] = list[i - 1] + list[i - 2];
        }
        
        bw.write(String.valueOf(list[N]));
        bw.flush();
        bw.close();
    }
}