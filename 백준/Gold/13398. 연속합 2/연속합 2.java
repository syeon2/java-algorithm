import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static int[] nList;
	static int[] rDp;
	static int[] lDp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
		nList = new int[N + 1];
		rDp = new int[N + 1];
		lDp = new int[N + 1];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= N; i++) {
			nList[i] = Integer.parseInt(st.nextToken());
		}

		// bottom-up
		for (int i = 1; i <= N; i++) {
			rDp[i] = Math.max(rDp[i - 1] + nList[i], nList[i]);
		}

		for (int i = N; i > 0; i--) {
			if (i == N) lDp[i] = nList[i];
			else lDp[i] = Math.max(lDp[i + 1] + nList[i], nList[i]);
		}

		int answer = rDp[1];
		for (int i = 1; i <= N; i++) {
			answer = Math.max(answer, rDp[i]);
		}

		for (int i = 1; i < N; i++) {
			if (nList[i] < 0) answer = Math.max(answer, rDp[i - 1] + lDp[i + 1]);
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }
}