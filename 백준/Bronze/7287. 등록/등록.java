import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("78");
        bw.newLine();
        bw.write("syeon94");
        
        bw.flush();
        bw.close();
    }
}