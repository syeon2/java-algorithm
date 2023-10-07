import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int idx = 1;
		int total = 1;

		int[] cache = new int[45];
		cache[1] = 1;

		for (int i = 2; i < 45; i++) {
			int num = i * (i + 1) / 2;
			cache[i] = num;
		}

		boolean[] list = new boolean[1001];

		for (int i = 1; i < cache.length; i++) {
			if (cache[i] > 1001) break;
			else {
				for (int k = 1; k < cache.length; k++) {
					if (cache[i] + cache[k] > 1001) break;

					for (int j = 1; j < cache.length; j++) {
						if (cache[i] + cache[k] + cache[j] > 1000) break;
						else list[cache[i] + cache[k] + cache[j]] = true;
					}
				}
			}
		}

		int N = Integer.parseInt(br.readLine());

		for (int n = 0; n < N; n++) {
			int K = Integer.parseInt(br.readLine());

			if (list[K]) {
				bw.write(String.valueOf(1));
				bw.newLine();
			} else {
				bw.write(String.valueOf(0));
				bw.newLine();
			}
		}

		bw.flush();
		bw.close();
	}
}