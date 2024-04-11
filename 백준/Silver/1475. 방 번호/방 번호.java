import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[10];

        while (N > 0) {
            int num = N % 10;

            if (num == 9 || num == 6) {
                list[6]++;
                list[9]++;
            } else {
                list[num]++;
            }

            N /= 10;
        }

        int ans = 0;
        for (int i = 0; i <= 9; i++) {
            if (i == 6 || i == 9) {
                if (list[i] % 2 == 1) ans = Math.max(ans, list[i] / 2 + 1);
                else ans = Math.max(ans, list[i] / 2);
            } else {
                ans = Math.max(ans, list[i]);
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}