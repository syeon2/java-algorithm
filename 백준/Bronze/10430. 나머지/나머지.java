import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        
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