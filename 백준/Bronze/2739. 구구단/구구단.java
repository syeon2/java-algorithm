import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        System.out.println(N + " * 1 = " + (N * 1));
        System.out.println(N + " * 2 = " + (N * 2));
        System.out.println(N + " * 3 = " + (N * 3));
        System.out.println(N + " * 4 = " + (N * 4));
        System.out.println(N + " * 5 = " + (N * 5));
        System.out.println(N + " * 6 = " + (N * 6));
        System.out.println(N + " * 7 = " + (N * 7));
        System.out.println(N + " * 8 = " + (N * 8));
        System.out.println(N + " * 9 = " + (N * 9));
    }
}