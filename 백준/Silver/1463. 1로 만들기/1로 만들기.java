import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] cache = new int[N + 1];
		Arrays.fill(cache, Integer.MAX_VALUE);
		cache[1] = 0;

		for (int i = 1; i <= N; i++) {
			if (i + 1 <= N) cache[i + 1] = Math.min(cache[i + 1], cache[i] + 1);
			if (i * 2 <= N) cache[i * 2] = Math.min(cache[i * 2], cache[i] + 1);
			if (i * 3 <= N) cache[i * 3] = Math.min(cache[i * 3], cache[i] + 1);
		}

		bw.write(String.valueOf(cache[N]));
		bw.flush();
		bw.close();
	}
}
