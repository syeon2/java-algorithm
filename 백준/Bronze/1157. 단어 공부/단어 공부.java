import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] list = br.readLine().toCharArray();

		int[] cache = new int[26];
		int max = 0;

		for (int i = 0; i < list.length; i++) {
			if (list[i] >= 'A' && list[i] <= 'Z') {
				int index = list[i] - 'A';

				cache[index]++;

				if (cache[index] > max) max = cache[index];
			} else {
				int index = list[i] - 'a';

				cache[index]++;

				if (cache[index] > max) max = cache[index];
			}
		}

		int count = 0;
		int idx = 0;
		for (int i = 0; i < cache.length; i++) {
			if (cache[i] == max) {
				idx = i;
				count++;
			}

			if (count > 1) break;
		}

		if (count > 1) bw.write(String.valueOf("?"));
		else bw.write(String.valueOf((char) (idx + 'A')));

		bw.flush();
		bw.close();
	}
}