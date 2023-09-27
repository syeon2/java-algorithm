import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean[] list = new boolean[42];
        
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            
            list[num % 42] = true;
        }
        
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i]) count++;
        }
        
        System.out.println(count);
    }
}