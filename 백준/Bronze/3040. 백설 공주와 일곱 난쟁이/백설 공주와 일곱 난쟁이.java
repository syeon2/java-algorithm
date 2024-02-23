import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] list = new int[9];
        for (int i = 0; i < 9; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < 9; i++) {
            
            for (int k = i + 1; k < 9; k++) {
                
                int sum = 0;
                for (int j = 0; j < 9; j++) {
                    if (i == j || j == k) continue;
                    
                    sum += list[j];
                }
                
                if (sum == 100) {
                    for (int j = 0; j < 9; j++) {
                        if (i == j || k == j) continue;
                        
                        sb.append(list[j]).append("\n");
                    }
                    
                    flag = true;
                }
                
                if (flag) break;
            }
            
            if (flag) break;
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}