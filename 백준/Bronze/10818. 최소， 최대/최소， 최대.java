import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] list = br.readLine().split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < N; i++) {
            int target = Integer.parseInt(list[i]);
            
            if (min > target) min = target;
            if (max < target) max = target;
        }
        
        System.out.println(min + " " + max);
    }
}