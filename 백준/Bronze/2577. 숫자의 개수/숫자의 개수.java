import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int total = 1;
        
        for (int i = 0; i < 3; i++) {
            total *= Integer.parseInt(br.readLine());
        }
        
        int[] cache = new int[10];
        String value = String.valueOf(total);
        
        for (int i = 0; i < value.length(); i++) {
            cache[value.charAt(i) - '0']++;
        }
        
        for (int i = 0; i < cache.length; i++) {
            System.out.println(cache[i]);
        }
    }
}