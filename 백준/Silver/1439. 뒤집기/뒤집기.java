import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        int onePart = 0;
        int zeroPart = 0;
        
        int curN = -1;
        
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            
            if (curN != num) {
                if (num == 1) {
                    onePart++;
                    curN = num;
                } else {
                    zeroPart++;
                    curN = num;
                }
            }
        }
        
        bw.write(String.valueOf(Math.min(onePart, zeroPart)));
        bw.flush();
        bw.close();
    }
}