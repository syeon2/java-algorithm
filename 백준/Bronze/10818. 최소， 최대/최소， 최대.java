import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        String[] list = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(list[i]);
            
            if (max < num) max = num;
            if (min > num) min = num;
        }
        
        System.out.println(min + " " + max);
    }
}