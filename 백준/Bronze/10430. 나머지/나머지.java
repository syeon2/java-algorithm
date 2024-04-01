import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        int c = Integer.parseInt(list[2]);
        
        bw.write(String.valueOf((a + b) % c));
        bw.newLine();
        
        bw.write(String.valueOf(((a % c) + (b % c)) % c));
        bw.newLine();
        
        bw.write(String.valueOf((a * b) % c));
        bw.newLine();
        
        bw.write(String.valueOf(((a % c) * (b % c)) % c));
        
        bw.flush();
        bw.close();
    }
}