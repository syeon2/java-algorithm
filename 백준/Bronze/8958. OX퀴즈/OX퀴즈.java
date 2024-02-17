import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        for (int n = 0; n < N; n++) {
            char[] list = br.readLine().toCharArray();
            
            int score = 0;
            int repeat = 0;
            
            for (int i = 0; i < list.length; i++) {
                if (list[i] == 'X') repeat = 0;
                else {
                    repeat += 1;
                    score += repeat;
                }
            }
            
            bw.write(String.valueOf(score));
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}