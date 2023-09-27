import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            char[] list = br.readLine().toCharArray();
        
            int score = 1;
            int total = 0;
        
            for (int k = 0; k < list.length; k++) {
                if (list[k] == 'O') {
                    total += score++;
                } else {
                    score = 1;
                }
            }
        
            System.out.println(total);   
        }
    }
}