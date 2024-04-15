import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int multi = 1;
        for (int i = 1; i <= N; i++) {
            multi *= 2;
        }
        
        bw.write(String.valueOf((multi + 1) * (multi + 1)));
        bw.flush();
        bw.close();
    }
}