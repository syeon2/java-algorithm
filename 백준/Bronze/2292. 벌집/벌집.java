import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int count = 0;
        int total = 1;
        
        while (true) {
            if (total + (6 * count) < N) {
                total += 6 * count;
                count++;
            } else break;
        }
        
        bw.write(String.valueOf(count + 1));
        bw.flush();
        bw.close();
    }
}