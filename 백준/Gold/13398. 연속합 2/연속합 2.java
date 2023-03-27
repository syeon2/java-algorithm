import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static int[] list;
	static int[] lDp;
	static int[] rDp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		list = new int[N];
		lDp = new int[N];
		rDp = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		// bottom-up
		lDp[0] = list[0];
		for (int i = 1; i < N; i++) {
			lDp[i] = Math.max(lDp[i - 1] + list[i], list[i]);
		}

		rDp[N - 1] = list[N - 1];
		for (int i = N - 2; i >= 0; i--) {
			rDp[i] = Math.max(rDp[i + 1] + list[i], list[i]);
		}


		int answer = lDp[0];
		for (int i = 0; i < N; i++) {
			answer = Math.max(answer, lDp[i]);

			if (i > 0 && i < N - 1) answer = Math.max(answer, lDp[i - 1] + rDp[i + 1]);
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}
}