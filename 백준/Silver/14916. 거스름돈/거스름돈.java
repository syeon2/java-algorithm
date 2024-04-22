import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int ans = Integer.MAX_VALUE;

        int five = 0;
        while (five * 5 <= N) {

            int remain = N - (five * 5);

            if (remain % 2 == 0) ans = Math.min(ans, five + (remain / 2));

            five++;
        }

        if (ans == Integer.MAX_VALUE) bw.write(String.valueOf(-1));
        else bw.write(String.valueOf(ans));

        bw.flush();
        bw.close();
    }
}