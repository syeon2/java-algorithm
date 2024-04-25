import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] list = new int[10];
        for (int n = 0; n < 10; n++) {
            list[n] = Integer.parseInt(br.readLine());
        }

        int ans = 0;
        int value = 0;

        for (int i = 0; i < 10; i++) {
            int temp = 0;

            for (int k = 0; k <= i; k++) {
                temp += list[k];
            }

            if (Math.abs(100 - value) >= Math.abs(100 - temp) && value < temp) {
                ans = temp;
                value = temp;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}