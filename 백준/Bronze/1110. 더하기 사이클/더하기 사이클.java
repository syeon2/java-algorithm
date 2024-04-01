// 1. 주어진 수의 각 자리수를 더한다.
// 2. 원래 수의 1의자리 값 + " " + 자리수를 더한 1의 자리 값

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int tempN = concatNum(N, sumPos(N));
        int ans = 1;
        
        while (N != tempN) {
            ans++;
            tempN = concatNum(tempN, sumPos(tempN));
        }
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
    
    public static int concatNum(int base, int sum) {
        int a = base % 10;
        int b = sum % 10;
        
        return (a * 10) + b;
    }
    
    public static int sumPos(int num) {
        int a = num / 10;
        int b = num % 10;
        
        return a + b;
    }
}