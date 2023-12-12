import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] list = br.readLine().toCharArray();

		int[] ans = new int[26];
		Arrays.fill(ans, -1);

		for (int i = 0; i < list.length; i++) {
			int idx = list[i] - 'a';

			if (ans[idx] == -1) ans[idx] = i;
		}

		for (int i = 0; i < 26; i++) {
			if (ans[i] == -1) bw.write("-1 ");
			else {
				bw.write(String.valueOf(ans[i]));
				bw.write(" ");
			}
		}

		bw.flush();
		bw.close();
	}
}