import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int ansSum = 0;
        int ansMin = Integer.MAX_VALUE;
        
        for (int i = 0; i < 7; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (num % 2 == 1) {
                ansSum += num;
                ansMin = Math.min(ansMin, num);
            }
        }
        
        if (ansSum == 0) bw.write("-1");
        else bw.write(ansSum + "\n" + ansMin);
        
        bw.flush();
        bw.close();
    }
}