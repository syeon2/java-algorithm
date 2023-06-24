import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static int[] list;
	static int[] rDp;
	static int[] lDp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
		list = new int[N + 1];
		rDp = new int[N + 1];
		lDp = new int[N + 1];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		// 점화식
		// rD[N] = max(rD[I]) + 1, I > 0, I < N, list[N] > list[I]
		// lD[N] = max(lD[I]) + 1, I > 0, I < N, list[N] < list[I]

		// bottom-up
		// for (int i = 1; i <= N; i++) {
		//
		// 	rDp[i] = 1;
		// 	for (int k = 1; k < i; k++) {
		// 		if (list[i] > list[k]) {
		// 			rDp[i] = Math.max(rDp[i], rDp[k] + 1);
		// 		}
		// 	}
		// }
		//
		// for (int i = N; i > 0; i--) {
		//
		// 	lDp[i] = 1;
		// 	for (int k = N; k > i; k--) {
		// 		if (list[i] > list[k]) {
		// 			lDp[i] = Math.max(lDp[i], lDp[k] + 1);
		// 		}
		// 	}
		// }

		for (int i = 1; i <= N; i++) {
			rTopDown(i);
		}

		for (int i = N; i > 0; i--) {
			lTopDown(i, N);
		}

		int answer = 0;
		for (int i = 1; i <= N; i++) {
			answer = Math.max(answer, rDp[i] + lDp[i] - 1);
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }

	public static int rTopDown(int n) {
		if (n == 1) return rDp[n] = 1;

		if (rDp[n] == 0) {
			rDp[n] = 1;

			for (int i = 1; i < n; i++) {
				if (list[n] > list[i]) {
					rDp[n] = Math.max(rDp[n], rTopDown(i) + 1);
				}
			}
		}

		return rDp[n];
	}

	public static int lTopDown(int n, int N) {
		if (n == N) return lDp[n] = 1;

		if (lDp[n] == 0) {
			lDp[n] = 1;

			for (int i = N; i > n; i--) {
				if (list[n] > list[i]) {
					lDp[n] = Math.max(lDp[n], lTopDown(i, N) + 1);
				}
			}
		}

		return lDp[n];
	}
}
