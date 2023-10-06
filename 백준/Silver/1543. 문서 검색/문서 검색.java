import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] aList = br.readLine().toCharArray();
		char[] bList = br.readLine().toCharArray();

		int count = 0;
		int idx = 0;

		while (aList.length - idx >= bList.length) {
			boolean flag = true;

			for (int i = idx; i < idx + bList.length; i++) {
				if (aList[i] != bList[i - idx]) {
					flag = false;
					break;
				}
			}

			if (flag) {
				count++;
				idx += bList.length;
			} else {
				idx++;
			}
		}

		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
}