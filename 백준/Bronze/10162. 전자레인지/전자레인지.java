import java.io.*;

public class Main {

    public static int[] list = {300, 60, 10};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] ans = new int[3];
        for (int i = 0; i < 3; i++) {
            ans[i] = N / list[i];
            N = N % list[i];
        }

        if (N > 0) bw.write("-1");
        else bw.write(ans[0] + " " + ans[1] + " " + ans[2]);

        bw.flush();
        bw.close();
    }
}