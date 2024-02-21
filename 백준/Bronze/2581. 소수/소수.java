import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        boolean[] isNotPrime = new boolean[N + 1];
        isNotPrime[1] = true;
        
        for (int i = 2; i <= N; i++) {
            if (isNotPrime[i]) continue;
            
            int cnt = 2;
            while (i * cnt <= N) {
                int idx = i * cnt++;
                
                isNotPrime[idx] = true;
            }
        }
        
        int ans = 0;
        int min = -1;
        for (int i = M; i <= N; i++) {
            if (!isNotPrime[i]) {
                ans += i;
                
                if (min == -1) min = i;
            }
        }
        
        if (min == -1) System.out.println(min);
        else {
            System.out.println(ans);
            System.out.println(min);
        }
    }
}