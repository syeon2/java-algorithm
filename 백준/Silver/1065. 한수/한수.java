import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int target = Integer.parseInt(br.readLine());
        
        int count = 0;
        for (int i = 1; i <= target; i++) {
            if (check(i)) count++;
        }
        
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
    
    public static boolean check(int num) {
        if (num < 100) return true;
        
        String[] numStr = String.valueOf(num).split("");
        
        int gap = 0;
        for (int i = 0; i < numStr.length - 1; i++) {
            if (i == 0) {
                gap = Integer.parseInt(numStr[i]) - Integer.parseInt(numStr[i + 1]);
            } else {
                if (gap != Integer.parseInt(numStr[i]) - Integer.parseInt(numStr[i + 1])) {
                    return false;
                }
            }
        }
        
        return true;
    }
}