import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int n = 0; n < N; n++) {
            int K = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            
            int[][] home = new int[K + 1][B + 1];
            for (int i = 0; i <= B; i++) {
                home[0][i] = i;
            }
            
            for (int i = 1; i <= K; i++) {
                for (int k = 0; k <= B; k++) {
                    
                    for (int j = 0; j <= k; j++) {
                        home[i][k] += home[i - 1][j];
                    }
                }
            }
            
            sb.append(home[K][B]).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}