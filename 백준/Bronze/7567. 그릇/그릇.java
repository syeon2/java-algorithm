import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        int sum = 10;
        char bowl = str.charAt(0);
        
        for (int i = 1; i < str.length(); i++) {
            if (bowl != str.charAt(i)) sum += 10;
            else sum += 5;
            
            bowl = str.charAt(i);
        }
        
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}