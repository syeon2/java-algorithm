import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());
        
        bw.write(String.valueOf(str.charAt(N - 1)));
        bw.flush();
        bw.close();
    }
}