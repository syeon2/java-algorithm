import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int answer = Integer.parseInt(br.readLine());
        int idx = 1;
        
        for (int i = 2; i <= 9; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (answer < num) {
                answer = num;
                idx = i;
            }
        }
        
        System.out.println(answer);
        System.out.println(idx);
    }
}