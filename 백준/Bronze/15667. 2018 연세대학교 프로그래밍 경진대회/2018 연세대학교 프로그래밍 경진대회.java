import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int total = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= 150; i++) {
            if ((i * i) + i + 1 == total) {
                bw.write(String.valueOf(i));
                break;
            }
        }
        
        bw.flush();
        bw.close();
    }
}