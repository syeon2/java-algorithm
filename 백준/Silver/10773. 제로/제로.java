import java.util.Scanner;
import java.util.Stack;

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

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.print(sum);
    }
}
