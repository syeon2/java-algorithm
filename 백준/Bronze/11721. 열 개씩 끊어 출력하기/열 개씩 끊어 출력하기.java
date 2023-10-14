import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		while (str.length() >= 10) {
			String temp = str.substring(0, 10);

			bw.write(temp);
			bw.newLine();

			str = str.substring(10);
		}

		bw.write(str);
		bw.flush();
		bw.close();
	}
}