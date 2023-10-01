import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] cache = new int[N];
        
        String[] str = br.readLine().split(" ");
        int[] list = new int[N];
        
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(list);
        
        for (int i = 0; i < N; i++) {            
            for (int k = i; k < N; k++) {
                cache[k] += list[i];
            }
        }
        
        int total = 0;
        for (int i = 0; i < N; i++) {
            total += cache[i];
        }
        
        System.out.println(total);
    }
}