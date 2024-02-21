import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] orders = new int[N];
        int[][] record = new int[N][2];
        
        for (int n = 0; n < N; n++) {
            int weight = sc.nextInt();
            int height = sc.nextInt();
            
            record[n][0] = weight;
            record[n][1] = height;
        }
        
        for (int i = 0; i < N; i++) {
            int targetWeight = record[i][0];
            int targetHeight = record[i][1];
            
            int cnt = 1;
            
            for (int k = 0; k < N; k++) {
                if (i == k) continue;
                
                int w = record[k][0];
                int h = record[k][1];
                
                if (targetWeight < w && targetHeight < h) cnt++;
            }
            
            orders[i] = cnt;
        }
        
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", orders[i]);
        }
    }
}