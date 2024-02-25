import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        
        int ansMax = 0;
        int ansPerson = 0;
        
        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int[] list = new int[5];
            for (int i = 0; i < 5; i++) {
                list[i] = Integer.parseInt(st.nextToken());
            }
            
            int max = 0;
            for (int i = 0; i < 5; i++) {
                
                for (int k = i + 1; k < 5; k++) {
                    
                    for (int j = k + 1; j < 5; j++) {
                        int sum = list[i] + list[k] + list[j];
                        
                        max = Math.max(max, sum % 10);
                    }
                }
            }
            
            if (ansMax <= max) {
                ansMax = max;
                ansPerson = n + 1;
            }
        }
        
        bw.write(String.valueOf(ansPerson));
        bw.flush();
        bw.close();
    }
}