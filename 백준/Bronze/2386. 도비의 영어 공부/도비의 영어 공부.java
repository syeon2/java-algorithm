import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();

		while (true) {
			String s = br.readLine();

			if (s.equals("#")) break;

			boolean isBig = true;
			char c = s.charAt(0);

			if (c >= 'A' && c <= 'Z') {
				c = (char) (c - 'A' + 'a');
			} else {
				isBig = false;
			}

			String sentence = s.substring(2).toLowerCase();

			int cnt = 0;

			for (int i = 0; i < sentence.length(); i++) {
				if (c == sentence.charAt(i)) cnt++;
			}

			if (isBig) {
				sb.append(c - 'a' + 'A');
			} else sb.append(c);

			sb.append(" ").append(cnt).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
