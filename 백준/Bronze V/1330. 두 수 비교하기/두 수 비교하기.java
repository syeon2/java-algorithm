import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] list = br.readLine().split(" ");
        int A = Integer.parseInt(list[0]);
        int B = Integer.parseInt(list[1]);
        
        if (A > B) bw.write(">");
        else if (A < B) bw.write("<");
        else bw.write("==");
        
        bw.flush();
        bw.close();
    }
}