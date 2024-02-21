import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        
        bw.write(String.valueOf(gcd(a, b)) + " " + String.valueOf(lcm(a, b)));
        bw.flush();
        bw.close();
    }
    
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}