import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		String s = br.readLine();

		int cnt = 0;

		while (str.indexOf(s) != -1) {
			cnt++;
			str = str.substring(str.indexOf(s) + 1 + s.length() - 1);
		}

		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
}
