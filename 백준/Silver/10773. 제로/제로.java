import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        Stack<Integer> stack = new Stack<>();
        for (int n = 0; n < N; n++) {
            int num = sc.nextInt();
            
            if (num == 0) stack.pop();
            else stack.push(num);
        }
        
        int ans = 0;
        while (stack.size() > 0) {
            ans += stack.pop();
        }
        
        System.out.println(ans);
    }
}