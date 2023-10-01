import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        
        int[] list = new int[N];
        
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        
        int count = 0;
        
        for (int i = N - 1; i >= 0; i--) {
            if (K / list[i] > 0) {
                count += K / list[i];
                K = K % list[i];
            }
            
            if (K == 0) break;
        }
        
        System.out.println(count);
    }
}