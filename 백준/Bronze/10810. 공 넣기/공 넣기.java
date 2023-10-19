import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] bucket = new int[N + 1];

		for (int m = 0; m < M; m++) {
			st = new StringTokenizer(br.readLine(), " ");

			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			int num = Integer.parseInt(st.nextToken());

			for (int i = start; i <= end; i++) {
				bucket[i] = num;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			sb.append(bucket[i]).append(" ");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}