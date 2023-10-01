import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] list = br.readLine().toCharArray();

		int total = 0;
		for (int i = 0; i < list.length; i++) {
			int c = list[i] - 'A';

			if (c < 3) {
				total += 3;
			} else if (c < 6) {
				total += 4;
			} else if (c < 9) {
				total += 5;
			} else if (c < 12) {
				total += 6;
			} else if (c < 15) {
				total += 7;
			} else if (c < 19) {
				total += 8;
			} else if (c < 22) {
				total += 9;
			} else {
				total += 10;
			}
		}

		System.out.println(total);
	}
}
