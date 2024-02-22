import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();

		String[] list = br.readLine().split(" ");
		String A = list[0];
		String B = list[1];

		int aIdx = A.length() - 1;
		int bIdx = B.length() - 1;

		int up = 0;
		while (aIdx >= 0 && bIdx >= 0) {
			int a = A.charAt(aIdx--) - '0';
			int b = B.charAt(bIdx--) - '0';

			sb.insert(0, (a + b + up) % 10);

			up = (a + b + up) / 10;
		}

		while (aIdx >= 0) {
			int a = A.charAt(aIdx--) - '0';

			sb.insert(0, (a + up) % 10);

			up = (a + up) / 10;
		}

		while (bIdx >= 0) {
			int b = B.charAt(bIdx--) - '0';

			sb.insert(0, (b + up) % 10);

			up = (b + up) / 10;
		}

		if (up > 0) sb.insert(0, up);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
