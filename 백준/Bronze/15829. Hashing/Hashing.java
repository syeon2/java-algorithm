import java.io.*;

public class Main {

    public static long R = 31;
    public static long MOD = 1234567891;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());

        long sum = 0;
        char[] list = br.readLine().toCharArray();

        for (int i = 0; i < L; i++) {
            int num = list[i] - 'a' + 1;

            sum += num * getHash(i);
            sum %= MOD;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }

    public static long getHash(int i) {
        long prod = 1;

        for (int k = 0; k < i; k++) {
            prod *= R;
            prod %= MOD;
        }

        return prod;
    }
}