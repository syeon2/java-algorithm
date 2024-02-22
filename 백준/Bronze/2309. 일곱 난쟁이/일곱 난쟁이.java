import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] list = new int[9];
        for (int i = 0; i < 9; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(list);
        
        int a = -1;
        int b = -1;
        
        for (int i = 0; i < 9; i++) {
            
            for (int k = i + 1; k < 9; k++) {
                
                int sum = 0;
                for (int j = 0; j < 9; j++) {
                    if (j == i || j == k) continue;
                    
                    sum += list[j];
                }
                
                if (sum == 100) {
                    a = i;
                    b = k;
                    break;
                }
            }
            
            if ((a != -1 && b != -1)) break;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            if (i == a || i == b) continue;
            
            sb.append(list[i]).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}