import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		int[] cache = new int[26];

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			cache[c - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			bw.write(String.valueOf(cache[i]));
			bw.write(" ");
		}

		bw.flush();
		bw.close();
	}
}