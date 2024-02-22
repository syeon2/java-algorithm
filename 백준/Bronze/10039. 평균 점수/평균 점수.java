import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int score = Integer.parseInt(br.readLine());
            
            if (score < 40) sum += 40;
            else sum += score;
        }
        
        bw.write(String.valueOf(sum / 5));
        bw.flush();
        bw.close();
    }
}