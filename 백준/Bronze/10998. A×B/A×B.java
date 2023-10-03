import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] list = br.readLine().split(" ");
        System.out.println(Integer.parseInt(list[0]) * Integer.parseInt(list[1]));
    }
}