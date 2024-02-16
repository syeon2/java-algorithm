import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int M = N;
        
        int cnt = 0;
        do {
            String temp = String.valueOf(N);
            if (temp.length() == 1) temp = "0".concat(temp);
            
            int sum = 0;
            for (int i = 0; i < temp.length(); i++) {
                sum += (temp.charAt(i) - '0');
            }
            
            String strSum = String.valueOf(sum);
            
            StringBuilder sb = new StringBuilder();
            sb.append(temp.charAt(temp.length() - 1))
                .append(strSum.charAt(strSum.length() - 1));
            
            int newNum = Integer.parseInt(sb.toString());
            
            N = newNum;
            cnt++;
        } while (N != M);
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}