import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();
		String str;
		while (!(str = br.readLine()).equals("0")) {
			int num = Integer.parseInt(str);

			if (num < 10) sb.append("yes").append("\n");
			else {
				boolean flag = true;
				for (int i = 0; i < str.length() / 2; i++) {
					if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
						flag = false;
						sb.append("no").append("\n");
						break;
					}
				}

				if (flag) sb.append("yes").append("\n");
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}