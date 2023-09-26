import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        
        String answer = "";
        for (int i = 1; i <= a; i++) {
            answer = answer.concat("*");
            System.out.println(answer);
        }
    }
}