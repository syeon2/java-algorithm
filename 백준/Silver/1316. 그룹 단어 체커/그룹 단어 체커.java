import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int ans = 0;

		for (int n = 0; n < N; n++) {
			int[] cache = new int[26];
			Arrays.fill(cache, -1);

			char[] list = br.readLine().toCharArray();
			boolean flag = true;

			for (int i = 0; i < list.length; i++) {
				int index = list[i] - 'a';

				if (cache[index] == -1) cache[index] = i;
				else {
					if (cache[index] + 1 == i) cache[index]++;
					else {
						flag = false;
						break;
					}
				}
			}

			if (flag) ans++;
		}

		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}