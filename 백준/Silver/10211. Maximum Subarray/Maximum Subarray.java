import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			int M = Integer.parseInt(br.readLine());

			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] list = new int[M];
			for (int i = 0; i < M; i++) {
				list[i] = Integer.parseInt(st.nextToken());

				if (i > 0 && list[i - 1] + list[i] >= 0 && list[i] < list[i - 1] + list[i]) list[i] += list[i - 1];
			}

			int max = list[0];
			for (int i = 1; i < M; i++) {
				max = Math.max(max, list[i]);
			}

			sb.append(max).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
