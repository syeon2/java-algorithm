import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[][] list = new char[15][15];

		int y = 0;

		String str;
		while ((str = br.readLine()) != null) {

			char[] strs = str.toCharArray();

			for (int i = 0; i < strs.length; i++) {
				list[y][i] = strs[i];
			}

			y++;
		}

		StringBuilder sb = new StringBuilder();

		for (int k = 0; k < 15; k++) {

			for (int i = 0; i < y; i++) {
				if (list[i][k] == 0) continue;

				sb.append(list[i][k]);
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}