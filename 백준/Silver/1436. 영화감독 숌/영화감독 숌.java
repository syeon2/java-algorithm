import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int ans = 666;
        for (int i = 1; i < N; i++) {
            
            int temp = ans + 1;
            
            while (!is666(temp)) {
                temp++;
            }
            
            ans = temp;
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
    
    public static boolean is666(int num) {
        boolean flag = true;
        
        int cnt = 0;
        while (num > 0) {
            int n = num % 10;
            
            if (n == 6) {
                cnt++;
                
                if (cnt == 3) break;
            } else {
                cnt = 0;
            }
            
            num /= 10;
        }
        
        if (cnt == 3) return true;
        else return false;
    }
}