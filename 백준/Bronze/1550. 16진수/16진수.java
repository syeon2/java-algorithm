import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String num = br.readLine();
        
        int ans = 0;
        for (int i = 0; i < num.length(); i++) {
            int remain = (num.charAt(i) >= '0' && num.charAt(i) <= '9') ? num.charAt(i) - '0' : 10 + (num.charAt(i) - 'A');
            
            ans = (ans * 16) + remain;
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}