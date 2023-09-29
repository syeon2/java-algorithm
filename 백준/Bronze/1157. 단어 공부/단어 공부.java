import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] list = br.readLine().toUpperCase().toCharArray();

		char[] cache = new char[26];

		for (int i = 0; i < list.length; i++) {
			int index = list[i] - 'A';

			cache[index]++;
		}

		int max = Integer.MIN_VALUE;
		int idx = 0;
		for (int i = 0; i < cache.length; i++) {
			if (max < cache[i]) {
				max = cache[i];
				idx = i;
			}
		}

		for (int i = 0; i < cache.length; i++) {
			if (max == cache[i] && idx != i) {
				System.out.println("?");
				return;
			}
		}

		char i = (char) ((char)idx + 'A');

		System.out.println(i);
	}
}
