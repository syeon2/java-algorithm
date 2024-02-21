import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int start = sc.nextInt();
        
        if (start == 1) {
            boolean flag = true;
            
            for (int i = 0; i < 7; i++) {
                int next = sc.nextInt();
                
                if (next - 1 != start) flag = false;
                else start = next;
            }
            
            if (flag) System.out.print("ascending");
            else System.out.print("mixed");
        } else if (start == 8) {
            boolean flag = true;
            
            for (int i = 0; i < 7; i++) {
                int next = sc.nextInt();
                
                if (next != start - 1) flag = false;
                else start = next;
            }
            
            if (flag) System.out.print("descending");
            else System.out.print("mixed");
        } else System.out.print("mixed");
    }
}