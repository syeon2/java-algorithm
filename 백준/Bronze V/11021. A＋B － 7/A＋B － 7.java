import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for (int n = 0; n < N; n++) {
            String[] list = br.readLine().split(" ");
            int a = Integer.parseInt(list[0]);
            int b = Integer.parseInt(list[1]);
            
            sb.append("Case #").append(n + 1).append(": ").append(a + b).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}