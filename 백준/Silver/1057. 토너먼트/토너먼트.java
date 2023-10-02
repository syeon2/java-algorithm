import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[1]);
        int b = Integer.parseInt(list[2]);
        
        int count = 1;
        while (true) {
            if (a % 2 == 0 && b % 2 == 1) {
                if (a / 2 == b / 2 + 1) break;
                else count++;
            } else if (a % 2 == 1 && b % 2 == 0) {
                if (a / 2 + 1 == b / 2) break;
                else count++;
            } else count++;
            
            if (a % 2 == 1) {
                a = (a / 2) + 1;
            } else {
                a = a / 2;
            }
            
            if (b % 2 == 1) {
                b = (b / 2) + 1;
            } else {
                b = b / 2;
            }
        }
        
        System.out.println(count);
    }
}