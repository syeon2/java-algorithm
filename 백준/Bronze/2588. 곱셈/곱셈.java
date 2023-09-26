import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        String[] b = br.readLine().split("");
        
        int answer = 0;
        int pos = 1;
        for (int i = b.length - 1; i >= 0; i--) {
            int partB = Integer.parseInt(b[i]);
            
            int multiply = a * partB;
            answer += (multiply * pos);
            pos *= 10;
            System.out.println(multiply);
        }
        
        System.out.println(answer);
    }
}