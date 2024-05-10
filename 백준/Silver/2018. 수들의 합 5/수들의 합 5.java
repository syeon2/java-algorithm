import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int point1 = 1;
        int point2 = 1;

        int ans = 0;
        int sum = 1;

        while (point1 <= N && point2 <= N) {
            if (sum == N) {
                ans++;

                sum -= point1;
                point1 += 1;
            } else if (sum < N) {
                point2 += 1;
                sum += point2;
            } else if (sum > N) {
                sum -= point1;
                point1 += 1;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}