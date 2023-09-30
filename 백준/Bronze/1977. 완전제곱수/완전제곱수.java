import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		boolean[] cache = new boolean[N + 1];

		for (int i = 1; i <= N; i++) {
			if (i * i > N) break;

			cache[i * i] = true;
		}

		int min = -1;
		int total = 0;
		for (int i = M; i <= N; i++) {
			if (cache[i]) {
				total += i;

				if (min == -1) min = i;
			}
		}

		if (min == -1) {
			System.out.println(-1);
		} else {
			System.out.println(total);
			System.out.println(min);
		}
	}
}
