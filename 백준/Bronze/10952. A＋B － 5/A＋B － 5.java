import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        while (true) {
            String[] list = br.readLine().split(" ");
            int A = Integer.parseInt(list[0]);
            int B = Integer.parseInt(list[1]);
            
            if (A == 0 && B == 0) break;
            
            sb.append(A + B).append("\n");
        }
        
        System.out.println(sb.toString());
    }
}