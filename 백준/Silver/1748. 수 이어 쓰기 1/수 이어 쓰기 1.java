import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        long sum = 0;
        
        for (int i = 1; i <= N; i++) {
            sum += getPos(i);
        }
        
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
    
    public static int getPos(int num) {
        if (num < 10) return 1;
        else if (num < 100) return 2;
        else if (num < 1000) return 3;
        else if (num < 10000) return 4;
        else if (num < 100000) return 5;
        else if (num < 1000000) return 6;
        else if (num < 10000000) return 7;
        else if (num < 100000000) return 8;
        else return 9;
    }
}