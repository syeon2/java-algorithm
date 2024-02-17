import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int K = Integer.parseInt(st.nextToken());
            char[] list = st.nextToken().toCharArray();
            
            for (int i = 0; i < list.length; i++) {
                for (int k = 0; k < K; k++) {
                    bw.write(String.valueOf(list[i]));
                }
            }
            
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}