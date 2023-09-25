import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        boolean[] isExist = new boolean[10001];
        
        for (int i = 1; i <= 10000; i++) {
            String[] numStr = String.valueOf(i).split("");
            
            int num = i;
            for (int k = 0; k < numStr.length; k++) {
                num += Integer.parseInt(numStr[k]);
            }
            
            if (num <= 10000) isExist[num] = true;
        }
        
        for (int i = 1; i < isExist.length; i++) {
            if (!isExist[i]) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        
        bw.flush();
        bw.close();
    }
}