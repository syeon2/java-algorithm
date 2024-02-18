import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        boolean[] list = new boolean[10001];
        
        for (int i = 1; i < 10000; i++) {
            
            int idx = d(i);
            
            if (idx <= 10000) list[idx] = true;
        }
       
        for (int i = 1; i <= 10000; i++) {
            if (!list[i]) sb.append(i).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
    public static int d(int n) {
        int temp = n;
        
        while (n > 0) {
            temp += (n % 10);
            
            n /= 10;
        }
        
        return temp;
    }
}