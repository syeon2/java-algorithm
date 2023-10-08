import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] list = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

		String str = br.readLine();

		int count = 0;

		for (int i = 0; i < list.length; i++) {
			while (true) {
				String s = str.replaceFirst(list[i], "-");

				if (str.equals(s)) break;
				else str = s;

				count++;
			}
		}

		String s = str.replaceAll("-", "");

		count += s.length();

		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
}
