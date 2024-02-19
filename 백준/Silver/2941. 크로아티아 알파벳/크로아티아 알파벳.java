import java.io.*;

public class Main {

	public static String[] list = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		int cnt = 0;
		while (true) {
			boolean flag = false;

			for (int i = 0; i < list.length; i++) {
				if (str.indexOf(list[i]) != -1) {
					int startPos = str.indexOf(list[i]);
					int endPos = str.indexOf(list[i]) + list[i].length() - 1;

					str = str.substring(0, startPos).concat(" ").concat(str.substring(endPos + 1));
					flag = true;
					cnt++;
					break;
				}
			}

			if (!flag) break;
		}

		str = str.replace(" ", "");
		bw.write(String.valueOf(cnt + str.length()));
		bw.flush();
		bw.close();
	}
}
