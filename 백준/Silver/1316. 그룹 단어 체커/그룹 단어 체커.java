import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int count = 0;
		for (int i = 0; i < N; i++) {
			char[] list = br.readLine().toCharArray();

			int[] cache = new int[26];
			Arrays.fill(cache, -1);

			boolean flag = true;

			for (int k = 0; k < list.length; k++) {
				int index = list[k] - 'a';

				if (cache[index] == -1) cache[index] = k;
				else {
					if (cache[index] + 1 == k) cache[index]++;
					else {
						flag = false;
						break;
					}
				}
			}

			if (flag) {
				count++;
			}
		}

		System.out.println(count);
	}
}
