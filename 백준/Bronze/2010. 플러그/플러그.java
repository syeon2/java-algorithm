import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int sum = Integer.parseInt(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            sum -= 1;
            sum += Integer.parseInt(br.readLine());
        }
        
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}