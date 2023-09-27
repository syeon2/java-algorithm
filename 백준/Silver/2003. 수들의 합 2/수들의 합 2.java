import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] strs = br.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int M = Integer.parseInt(strs[1]);
        
        String[] strs2 = br.readLine().split(" ");
        int[] list = new int[N];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(strs2[i]);
        }
        
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            
            int total = 0;
            for (int k = i; k < list.length; k++) {
                total += list[k];
                
                if (total == M) {
                    count++;
                    break;
                } else if (total > M) break;
            }
        }
        
        System.out.println(count);
    }
}