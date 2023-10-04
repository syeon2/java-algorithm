import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            String[] list = br.readLine().split(" ");
            int A = Integer.parseInt(list[0]);
            int B = Integer.parseInt(list[1]);
            
            sb.append("Case #")
                .append(i)
                .append(": ")
                .append(A)
                .append(" + ")
                .append(B)
                .append(" = ")
                .append(A + B)
                .append("\n");
        }
        
        System.out.println(sb.toString());
    }
}