import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        if (N < 100) bw.write(String.valueOf(N));
        else {
            int cnt = 99;
            
            for (int i = 100; i <= N; i++) {
                if (check(i)) cnt++;
            }
            
            bw.write(String.valueOf(cnt));
        }
        
        bw.flush();
        bw.close();
    }
    
    public static boolean check(int n) {
        int sub = ((n % 100) / 10) - (n % 10);
        
        String temp = String.valueOf(n);
        for (int i = 0; i < temp.length() - 1; i++) {
            if (temp.charAt(i) - temp.charAt(i + 1) != sub) return false;
        }
        
        return true;
    }
}