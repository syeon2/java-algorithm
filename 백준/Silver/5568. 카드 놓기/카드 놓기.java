import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());

		int[] list = new int[N];

		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}

		Set<Integer> set = new HashSet<>();
		StringBuilder sb;

		if (K == 2) {
			for (int i = 0; i < N; i++) {
				for (int k = 0; k < N; k++) {
					if (k == i) continue;

					sb = new StringBuilder();

					sb.append(list[i]).append(list[k]);

					set.add(Integer.parseInt(sb.toString()));
				}
			}
		} else if (K == 3) {
			for (int i = 0; i < N; i++) {
				for (int k = 0; k < N; k++) {
					if (i == k) continue;;

					for (int j = 0; j < N; j++) {
						if (i == j || k == j) continue;

						sb = new StringBuilder();

						sb.append(list[i]).append(list[k]).append(list[j]);

						set.add(Integer.parseInt(sb.toString()));
					}
				}
			}
		} else if (K == 4) {
			for (int i = 0; i < N; i++) {
				for (int k = 0; k < N; k++) {
					if (i == k) continue;

					for (int j = 0; j < N; j++) {
						if (i == j || k == j) continue;

						for (int z = 0; z < N; z++) {
							if (z == i || z == k || z == j) continue;

							sb = new StringBuilder();

							sb.append(list[i]).append(list[k]).append(list[j]).append(list[z]);

							set.add(Integer.parseInt(sb.toString()));
						}
					}
				}
			}
		}

		bw.write(String.valueOf(set.size()));
		bw.flush();
		bw.close();
	}
}