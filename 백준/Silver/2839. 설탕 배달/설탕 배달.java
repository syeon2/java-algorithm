import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int count = 0;
        int answer = Integer.MAX_VALUE;
        
        while (5 * count <= N) {
            int temp = N - (count * 5);
            
            if (temp % 3 == 0) {
                answer = Math.min(answer, count + (temp / 3));
            }
            
            count++;
        }
        
        if (answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);   
        }
    }
}