import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        BigInteger bi1 = new BigInteger(st.nextToken());
        BigInteger bi2 = new BigInteger(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        sb.append(bi1.divide(bi2)).append("\n").append(bi1.remainder(bi2));        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}