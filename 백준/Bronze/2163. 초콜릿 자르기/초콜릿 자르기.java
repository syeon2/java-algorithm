import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] cache = new int[N + 1][M + 1];

		for (int i = 1; i <= N; i++) {
			cache[i][1] = i - 1;
		}

		for (int i = 1; i <= M; i++) {
			cache[1][i] = i - 1;
		}

		for (int i = 2; i <= N; i++) {

			for (int k = 2; k <= M; k++) {
				if (i % 2 == 0 && k % 2 == 0) {
					cache[i][k] = cache[i / 2][k] + cache[i / 2][k] + 1;
				} else if (i % 2 == 1 && k % 2 == 0) {
					cache[i][k] = cache[i][k / 2] + cache[i][k / 2] + 1;
				} else if (i % 2 == 0 && k % 2 == 1) {
					cache[i][k] = cache[i / 2][k] + cache[i / 2][k] + 1;
				} else {
					cache[i][k] = cache[1][k] + cache[(i - 1) / 2][k] + cache[(i - 1) / 2][k] + 2;
				}
			}
		}

		bw.write(String.valueOf(cache[N][M]));
		bw.flush();
		bw.close();
	}
}
