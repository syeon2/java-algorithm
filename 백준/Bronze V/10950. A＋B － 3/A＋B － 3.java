import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        for (int n = 0; n < N; n++) {
            String[] list = br.readLine().split(" ");
            int a = Integer.parseInt(list[0]);
            int b = Integer.parseInt(list[1]);
            
            bw.write(String.valueOf(a + b));
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}