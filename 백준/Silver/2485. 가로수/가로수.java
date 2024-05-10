import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        int gap = list[1] - list[0];

        for (int i = 0; i < N - 1; i++) {
            gap = gcd(gap, list[i + 1] - list[i]);
        }

        int ans = 0;
        for (int i = 0; i < N - 1; i++) {
            int temp = list[i + 1] - list[i];

            ans += (temp / gap) - 1;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}