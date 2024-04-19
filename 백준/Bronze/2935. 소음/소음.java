import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger a = new BigInteger(br.readLine());
        String cmd  = br.readLine();
        BigInteger b = new BigInteger(br.readLine());

        if (cmd.equals("+")) a = a.add(b);
        else a = a.multiply(b);

        bw.write(String.valueOf(a));
        bw.flush();
        bw.close();
    }
}