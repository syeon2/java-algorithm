import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int sec = 0;
        for (int i = 0; i < 4; i++) {
            sec += Integer.parseInt(br.readLine());
        }
        
        int x = sec / 60;
        int y = sec % 60;
        
        bw.write(x + "\n" + y);
        bw.flush();
        bw.close();
    }
}