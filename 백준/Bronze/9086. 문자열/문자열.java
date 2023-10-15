import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for (int n = 0; n < N; n++) {
            String str = br.readLine();
            
            sb.append(str.charAt(0)).append(str.charAt(str.length() - 1)).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}