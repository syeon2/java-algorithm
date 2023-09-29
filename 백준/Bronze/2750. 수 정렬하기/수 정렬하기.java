import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean[] mCache = new boolean[1001];
        boolean[] pCache = new boolean[1001];

        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (num < 0) {
                mCache[Math.abs(num)] = true;
            } else {
                pCache[num] = true;
            }
        }
        
        for (int i = 1000; i >= 0; i--) {
            if (mCache[i]) System.out.println(i * -1);
        }
        
        for (int i = 0; i <= 1000; i++) {
            if (pCache[i]) System.out.println(i);
        }
    }
}