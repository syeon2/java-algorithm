import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        int sum = 0;
        int min = -1;
        
        for (int i = M; i <= N; i++) {
            int num = 1;
            
            while (true) {
                int temp = num * num;
                
                if (temp < i) num++;
                else if (temp == i) {
                    sum += i;
                    
                    if (min == -1) min = i;
                    break;
                } else {
                    break;
                }
            }
        }
        
        if (min == -1) bw.write("-1");
        else {
            bw.write(String.valueOf(sum));
            bw.newLine();
            bw.write(String.valueOf(min));
        }
        
        bw.flush();
        bw.close();
    }
}