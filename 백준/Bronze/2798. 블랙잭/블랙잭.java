import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(list);
		int answerX = 0;
		int answerY = 0;
		int answerZ = 0;

		int gap = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			for (int k = i + 1; k < N; k++) {
				for (int z = k + 1; z < N; z++) {
					if (list[i] + list[k] + list[z] > M) break;

					int num = Math.abs(list[i] + list[k] + list[z] - M);

					if (gap > num) {
						gap = num;

						answerX = i;
						answerY = k;
						answerZ = z;
					}
				}
			}
		}

		int sum = list[answerX] + list[answerY] + list[answerZ];

		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}
