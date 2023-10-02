import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] list = br.readLine().split(" ");
        int x = Integer.parseInt(list[0]);
        int y = Integer.parseInt(list[1]);
        int w = Integer.parseInt(list[2]);
        int h = Integer.parseInt(list[3]);
        
        x = Math.min(w - x, x);
        y = Math.min(h - y, y);
        
        System.out.println(Math.min(x, y));
    }
}