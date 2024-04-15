import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] list = br.readLine().split("");
        
        Arrays.sort(list, (a, b) -> {
            return b.compareTo(a);
        });
        
        int ans = -1;
        if (!list[list.length - 1].equals("0")) bw.write("-1");
        else {
            int sum = 0;
            
            for (int i = 0; i < list.length; i++) {
                sum += Integer.parseInt(list[i]);
            }
            
            if (sum % 3 > 0) bw.write("-1");
            else {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < list.length; i++) {
                    sb.append(Integer.parseInt(list[i]));
                }
                
                bw.write(sb.toString());
            }
        }
        
        bw.flush();
        bw.close();
    }
}