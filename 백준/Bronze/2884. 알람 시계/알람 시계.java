import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] list = br.readLine().split(" ");
        int H = Integer.parseInt(list[0]);
        int M = Integer.parseInt(list[1]);
        
        if (M >= 45) {
            System.out.println(H + " " + (M - 45));
        } else {
            if (H == 0) {
                System.out.println(23 + " " + (60 - (45 - M)));
            } else {
                System.out.println((H - 1) + " " + (60 - (45 - M)));
            }
        }
    }
}