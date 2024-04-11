import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        long ans = 0;

        for (int i = 0; i < N; i++) {
            int student = list[i];

            int case1 = twoPerson(student, B, C);

            ans += case1;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    public static int twoPerson(int student, int b, int c) {
        int ans = 0;

        student -= b;
        ans++;

        if (student > 0) {
            int remain = student % c;
            if (remain > 0) ans++;
            ans += student / c;
        }

        return ans;
    }
}