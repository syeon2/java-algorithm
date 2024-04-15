import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append(a.add(b)).append("\n")
                .append(a.subtract(b)).append("\n")
                .append(a.multiply(b)).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}