import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int answer = 1;
        
        for (int i = 1; i <= N; i++) {
            answer *= i;
        }
        
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}