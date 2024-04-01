import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for (int n = 0; n < N; n++) {
            char[] list = br.readLine().toCharArray();
            
            int score = 0;
            
            int cnt = 0;
            for (int i = 0; i < list.length; i++) {
                if (list[i] == 'O') score += ++cnt;
                else cnt = 0;
            }
            
            sb.append(score).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}