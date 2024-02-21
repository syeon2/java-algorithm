import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] list = new int[N];
        int idx = 0;
        int ans = 0;
        
        while (N-- > 0) {
            int num = sc.nextInt();
            
            if (num > 0) {
                list[idx++] = num;
                ans += num;
            } else {
                ans -= list[--idx];
                list[idx] = 0;
            }
        }
        
        System.out.print(ans);
    }
}