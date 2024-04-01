import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        String[] list = br.readLine().split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(list[i]);
            
            if (min > num) min = num;
            if (max < num) max = num;
        }
        
        bw.write(String.valueOf(min));
        bw.write(" ");
        bw.write(String.valueOf(max));
        
        bw.flush();
        bw.close();
    }
}