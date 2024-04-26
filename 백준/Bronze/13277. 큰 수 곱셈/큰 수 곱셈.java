import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        BigInteger n1 = new BigInteger(st.nextToken());
        BigInteger n2 = new BigInteger(st.nextToken());
        
        bw.write(String.valueOf(n1.multiply(n2)));
        bw.flush();
        bw.close();
    }
}