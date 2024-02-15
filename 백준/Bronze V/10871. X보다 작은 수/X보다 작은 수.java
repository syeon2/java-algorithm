import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] list = br.readLine().split(" ");
        int N = Integer.parseInt(list[0]);
        int X = Integer.parseInt(list[1]);
        
        String[] numbers = br.readLine().split(" ");
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(numbers[i]);
            
            if (num < X) {
                bw.write(String.valueOf(num));
                bw.write(" ");
            }
        }
        
        bw.flush();
        bw.close();
    }
}