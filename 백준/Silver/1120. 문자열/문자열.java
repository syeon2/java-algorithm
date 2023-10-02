import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] list = br.readLine().split(" ");
        
        String a = list[0];
        String b = list[1];
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= b.length() - a.length(); i++) {
            
            int count = 0;
            for (int k = i; k < i + a.length(); k++) {
                if (a.charAt(k - i) != b.charAt(k)) count++;
            }
            
            min = Math.min(min, count);
        }
        
        System.out.println(min);
    }
}