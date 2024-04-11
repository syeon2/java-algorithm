import java.io.*;

public class Main {
    
    public static int[] money = {25, 10, 5, 1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int n = 0; n < N; n++) {
            int num = Integer.parseInt(br.readLine());
            
            for (int i = 0; i < 4; i++) {
                sb.append(num / money[i]).append(" ");
                
                num = num % money[i];
            }
            
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}