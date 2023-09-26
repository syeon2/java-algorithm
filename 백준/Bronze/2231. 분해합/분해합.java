import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		int[] cache = new int[num + 1];
		Arrays.fill(cache, Integer.MAX_VALUE);

		for (int i = 1; i <= num; i++) {
			int n = d(i);

			if (n <= num) {
				cache[n] = Math.min(cache[n], i);
			}
		}

        int answer = (cache[cache.length - 1] == Integer.MAX_VALUE) ? 0 : cache[cache.length - 1];
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

	public static int d(int num) {
		int ans = num;

		while (num != 0) {
			ans += num % 10;
			num /= 10;
		}

		return ans;
	}
}
