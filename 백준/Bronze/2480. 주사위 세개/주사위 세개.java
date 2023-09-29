import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] list = br.readLine().split(" ");
        
        int[] cache = new int[7];
        
        int count = 0;
        
        for (int i = 0; i < 3; i++) {
            int pos = Integer.parseInt(list[i]);
            
            cache[pos] += 1;
            
            count = Math.max(count, cache[pos]);
        }

        for (int i = 6; i > 0; i--) {
            if (cache[i] == count) {
                if (count == 3) {
                    int answer = 10000 + (1000 * i);
                    
                    System.out.println(answer);
                    return;
                } else if (count == 2) {
                    int answer = 1000 + (100 * i);
                    
                    System.out.println(answer);
                    return;
                } else if (count == 1) {
                    System.out.println(i * 100);
                    return;
                }
            }
        }
    }
}