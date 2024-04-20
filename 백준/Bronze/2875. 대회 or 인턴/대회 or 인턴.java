import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int teamCnt = Math.min(N / 2, M);

        int remain = (N + M) - (teamCnt * 2) - teamCnt;

        while (remain < K) {
            remain += 3;
            teamCnt--;
        }

        if (teamCnt <= 0) bw.write("0");
        else bw.write(String.valueOf(teamCnt));

        bw.flush();
        bw.close();
    }
}