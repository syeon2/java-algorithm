import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[9];
        
        int total = 0;
        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            list[i] = num;
            total += num;
        }
        
        Arrays.sort(list);
        
        for (int i = 0; i < 9; i++) {
            for (int k = i + 1; k < 9; k++) {
                if (total - list[i] - list[k] == 100) {
                    for (int j = 0; j < 9; j++) {
                        if (j == i || j == k) continue;
                        
                        System.out.println(list[j]);
                    }
                    
                    return;
                }
            }
        }
    }
}