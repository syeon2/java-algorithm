import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] list = new int[42];
        
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            
            list[num % 42]++;
        }
        
        int cnt = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > 0) cnt++;
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}