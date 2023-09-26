import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] weight = new int[N];
		int[] height = new int[N];

		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());

			weight[i] = w;
			height[i] = h;
		}

		int[] cache = new int[N];

		for (int i = 0; i < N; i++) {
			int targetW = weight[i];
			int targetH = height[i];

			int order = 1;
			for (int k = 0; k < N; k++) {
				if (i == k) continue;

				if (targetW < weight[k] && targetH < height[k]) {
					order++;
				}
			}

			cache[i] = order;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cache.length; i++) {
			sb.append(cache[i]).append(" ");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
