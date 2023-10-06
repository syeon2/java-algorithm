import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		char[] list = br.readLine().toCharArray();
		int[] cache = new int[26];

		Arrays.fill(cache, -1);
		for (int i = 0; i < list.length; i++) {
			int index = list[i] - 'a';

			if (cache[index] == -1) {
				cache[index] = i;
			}
		}

		for (int i = 0; i < cache.length; i++) {
			sb.append(cache[i]).append(" ");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}