import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] w = new int[N];
		int[] h = new int[N];

		for (int i = 0; i < N; i++) {
			String[] info = br.readLine().split(" ");
			int weight = Integer.parseInt(info[0]);
			int height = Integer.parseInt(info[1]);

			w[i] = weight;
			h[i] = height;
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {

			int order = 1;
			for (int k = 0; k < N; k++) {
				if (i == k)
					continue;

				if (w[i] < w[k] && h[i] < h[k])
					order++;
			}

			sb.append(order).append(" ");
		}

		System.out.println(sb.toString());
	}
}