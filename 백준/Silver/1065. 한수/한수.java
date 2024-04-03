import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int ans = 0;
        
        for (int i = 1; i <= N; i++) {
            if (i < 10) ans++;
            else {
                if (isSpecial(i)) ans++;
            }
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
    
    public static boolean isSpecial(int num) {
        char[] list = String.valueOf(num).toCharArray();
        
        int gap = list[1] - list[0];
        
        for (int i = 1; i < list.length; i++) {
            if (list[i] - list[i - 1] != gap) return false;
        }
        
        return true;
    }
}