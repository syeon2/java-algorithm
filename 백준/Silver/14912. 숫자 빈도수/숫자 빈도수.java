import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        
        int ans = 0;
        
        for (int i = 1; i <= N; i++) {
            char[] list = String.valueOf(i).toCharArray();
            
            for (int k = 0; k < list.length; k++) {
                if (list[k] == String.valueOf(D).charAt(0)) ans++;
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}