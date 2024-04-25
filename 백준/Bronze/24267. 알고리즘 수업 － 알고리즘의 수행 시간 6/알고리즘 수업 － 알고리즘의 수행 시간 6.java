import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        long ans = 0;

        for (int i = 1; i <= N - 2; i++) {
            ans += (long) i * (N - 1 - i);
        }

        bw.write(String.valueOf(ans));
        bw.newLine();
        bw.write("3");
        bw.flush();
        bw.close();
    }
}