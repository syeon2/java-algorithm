import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int max = 0;
        int idx = 0;
        
        for (int i = 1; i <= 9; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (max < num) {
                max = num;
                idx = i;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(max).append("\n").append(idx);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}