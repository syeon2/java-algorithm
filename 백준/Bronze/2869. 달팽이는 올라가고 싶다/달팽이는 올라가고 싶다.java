import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] list = br.readLine().split(" ");
        int A = Integer.parseInt(list[0]);
        int B = Integer.parseInt(list[1]);
        int V = Integer.parseInt(list[2]);
        
        V -= A;
        
        int count = V / (A - B);
        if (V % (A - B) > 0) count++;
        
        System.out.println(count + 1);
    }
}