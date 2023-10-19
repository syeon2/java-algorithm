import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] list = new int[N + 1];

		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}

		for (int m = 0; m < M; m++) {
			st = new StringTokenizer(br.readLine(), " ");

			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			int temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= N; i++) {
			sb.append(list[i]).append(" ");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}