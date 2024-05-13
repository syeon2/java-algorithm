import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int a = N * 78 / 100;
        int b = N - (N * 20 / 100) * 22 / 100;

        bw.write(a + " " + b);
        bw.flush();
        bw.close();
    }
}