import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        if (num >= 90) {
            System.out.println("A");
            return;
        } else if (num >= 80) {
            System.out.println("B");
            return;
        } else if (num >= 70) {
            System.out.println("C");
            return;
        } else if (num >= 60) {
            System.out.println("D");
            return;
        } else {
            System.out.println("F");
        }
    }
}