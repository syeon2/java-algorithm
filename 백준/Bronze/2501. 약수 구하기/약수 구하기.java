import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] list = br.readLine().split(" ");
        
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) count += 1;
            
            if (count == b) {
                System.out.println(i);
                return;
            }
        }
        
        System.out.println(0);
    }
}