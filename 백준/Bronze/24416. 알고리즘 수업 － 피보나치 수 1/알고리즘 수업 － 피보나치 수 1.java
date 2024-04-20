import java.io.*;

public class Main {

    public static int ans1 = 0;
    public static int ans2 = 0;

    public static int N;
    public static int[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        memo = new int[N + 1];

        recur(N);
        dp(N);

        bw.write(ans1 + " " + ans2);
        bw.flush();
        bw.close();
    }

    public static int recur(int num) {
        if (num == 1 || num == 2) {
            ans1++;
            return 1;
        }

        return recur(num - 1) + recur(num - 2);
    }

    public static int dp(int num) {
        if (memo[num] != 0) return memo[num];
        else if (num == 1 || num == 2) return memo[num] = 1;

        ans2++;
        memo[num] = dp(num - 1) + dp(num - 2);

        return memo[num];
    }
}