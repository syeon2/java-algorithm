import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] list = br.readLine().toCharArray();
		int ans = 0;

		for (int i = 0; i < list.length; i++) {
			int num = convert(list[i]);

			ans += num;
		}

		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}

	public static int convert(char c) {
		if (c >= 'A' && c <= 'C') return 3;
		else if (c >= 'D' && c <= 'F') return 4;
		else if (c >= 'G' && c <= 'I') return 5;
		else if (c >= 'J' && c <= 'L') return 6;
		else if (c >= 'M' && c <= 'O') return 7;
		else if (c >= 'P' && c <= 'S') return 8;
		else if (c >= 'T' && c <= 'V') return 9;
		else return 10;
	}
}
