import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] list = br.readLine().trim().toCharArray();

		int len = list.length;

		String ans = "";


		for (int k =  1; k < len - 1; k++) {

			for (int j = k + 1; j < len; j++) {
				char[] temp = copy(list);

				int ni = 0;
				int nk = k - 1;

				while (ni < nk) {
					char c = temp[ni];
					temp[ni] = temp[nk];
					temp[nk] = c;

					ni++;
					nk--;
				}

				int zk = k;
				int zj = j - 1;

				while (zk < zj) {
					char c2 = temp[zk];
					temp[zk] = temp[zj];
					temp[zj] = c2;

					zk++;
					zj--;
				}

				int qj = j;
				int last = len - 1;

				while (qj < last) {
					char c3 = temp[qj];
					temp[qj] = temp[last];
					temp[last] = c3;

					qj++;
					last--;
				}

				if (ans.isEmpty()) ans = String.valueOf(temp);
				else {
					if (ans.compareTo(String.valueOf(temp)) > 0) ans = String.valueOf(temp);
				}
			}
		}

		bw.write(ans);
		bw.flush();
		bw.close();
	}

	public static char[] copy(char[] list) {
		char[] temp = new char[list.length];

		for (int i = 0; i < list.length; i++) {
			temp[i] = list[i];
		}

		return temp;
	}
}

