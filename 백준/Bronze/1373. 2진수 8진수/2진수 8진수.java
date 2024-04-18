import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        BigInteger integer = new BigInteger(str, 2);
        String result = integer.toString(8);
        
        bw.write(result);
        bw.flush();
        bw.close();
    }
}