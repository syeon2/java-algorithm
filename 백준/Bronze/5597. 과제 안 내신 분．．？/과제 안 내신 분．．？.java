import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] list = new int[31];
        for (int i = 0; i < 28; i++) {
            int idx = sc.nextInt();
            
            list[idx]++;
        }
        
        for (int i = 1; i <= 30; i++) {
            if (list[i] == 0) System.out.println(i);
        }
    }
}