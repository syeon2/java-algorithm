import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] info = br.readLine().split(" ");
        int A = Integer.parseInt(info[0]);
        int B = Integer.parseInt(info[1]);
        int C = Integer.parseInt(info[2]);
        
        if (B >= C) System.out.println(-1);
        else {
            long cost = A;
            long paid = 0;
            
            long count = 0;
            while (true) {
                cost += B;
                paid += C;
                
                count++;
                
                if (cost < paid) break;
            }
            
            System.out.println(count);
        }
    }
}