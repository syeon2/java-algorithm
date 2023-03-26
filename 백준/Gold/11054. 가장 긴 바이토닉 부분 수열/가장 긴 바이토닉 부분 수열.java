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
		// for (int i = 0; i < N; i++) {
		// 	lDp[i] = 1;
		//
		// 	for (int k = 0; k < i; k++) {
		// 		if (list[i] > list[k]) lDp[i] = Math.max(lDp[i], lDp[k] + 1);
		// 	}
		// }
		//
		// for (int i = N - 1; i >= 0; i--) {
		// 	rDp[i] = 1;
		//
		// 	for (int k = N - 1; k > i; k--) {
		// 		if (list[i] > list[k]) rDp[i] = Math.max(rDp[i], rDp[k] + 1);
		// 	}
		// }

		for (int i = 0; i < N; i++) {
			lDpTopDown(i);
		}

		for (int i = N - 1; i >= 0; i--) {
			rDpTopDown(i);
		}

		int answer = 0;
		for (int i = 0; i < N; i++) {
			answer = Math.max(answer, lDp[i] + rDp[i] - 1);
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

	public static int lDpTopDown(int n) {
		if (n == 0) return lDp[n] = 1;

		if (lDp[n] == 0) {
			lDp[n] = 1;
			
			for (int i = 0; i < n; i++) {
				if (list[n] > list[i]) lDp[n] = Math.max(lDp[n], lDpTopDown(i) + 1);
			}
		}

		return lDp[n];
	}

	public static int rDpTopDown(int n) {
		if (n == list.length - 1) return rDp[n] = 1;

		if (rDp[n] == 0) {
			rDp[n] = 1;
			
			for (int i = list.length - 1; i > n; i--) {
				if (list[n] > list[i]) rDp[n] = Math.max(rDp[n], rDpTopDown(i) + 1);
			}
		}

		return rDp[n];
	}
}