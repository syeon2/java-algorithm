import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] list = br.readLine().split(" ");
        
        int k = 1 - Integer.parseInt(list[0]);
        int q = 1 - Integer.parseInt(list[1]);
        int l = 2 - Integer.parseInt(list[2]);
        int b = 2 - Integer.parseInt(list[3]);
        int n = 2 - Integer.parseInt(list[4]);
        int p = 8 - Integer.parseInt(list[5]);
        
        System.out.print(k + " ");
        System.out.print(q + " ");
        System.out.print(l + " ");
        System.out.print(b + " ");
        System.out.print(n + " ");
        System.out.print(p);
    }
}