import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		String[] list = new String[N];
		for (int i = 0; i < list.length; i++) {
			list[i] = br.readLine();
		}

		for (int i = 0; i < M; i++) {
			int[] cache = new int[26];

			for (int k = 0; k < N; k++) {
				String str = list[k];
				int index = str.charAt(i) - 'A';

				cache[index]++;
			}

			int count = 0;
			char c = 0;

			for (int k = 0; k < cache.length; k++) {
				if (count < cache[k]) {
					count = cache[k];
					c = (char) (k + 'A');
				}
			}

			sb.append(String.valueOf(c));
		}

		String answerStr = sb.toString();
		int answerCount = 0;

		for (int i = 0; i < N; i++) {

			for (int k = 0; k < M; k++) {
				if (answerStr.charAt(k) != list[i].charAt(k)) answerCount++;
			}
		}

		bw.write(sb.toString());
		bw.newLine();
		bw.write(String.valueOf(answerCount));
		bw.flush();
		bw.close();
	}
}
