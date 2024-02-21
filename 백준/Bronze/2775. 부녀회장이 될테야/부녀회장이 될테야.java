import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[][] town = new int[15][15];
        for (int i = 0; i < 15; i++) {
            town[0][i] = i;
        }
        
        for (int i = 1; i < 15; i++) {
            for (int k = 1; k < 15; k++) {
                town[i][k] = town[i - 1][k] + town[i][k - 1];
            }
        }
        
        for (int n = 0; n < N; n++) {
            int floor = sc.nextInt();
            int room = sc.nextInt();
            
            System.out.println(town[floor][room]);
        }
    }
}