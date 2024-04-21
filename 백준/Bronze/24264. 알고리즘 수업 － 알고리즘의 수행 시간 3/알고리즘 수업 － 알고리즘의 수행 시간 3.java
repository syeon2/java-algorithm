import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        long n2 = (long) N * (long) N;
        
        bw.write(n2 + "\n" + 2);
        bw.flush();
        bw.close();
    }
}