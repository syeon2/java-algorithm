import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());

			String[] list = new String[N];
			for (int i = 0; i < N; i++) {
				list[i] = br.readLine();
			}

			String str = "";
			boolean canFal = false;

			for (int i = 0; i < N; i++) {
				for (int k = 0; k < N; k++) {
					if (i == k) continue;

					boolean flag = true;
					String newStr = list[i] + list[k];
					char[] newStrList = newStr.toCharArray();

					for (int j = 0; j < newStrList.length / 2; j++) {
						if (newStrList[j] != newStrList[newStrList.length - 1 - j]) {
							flag = false;
							break;
						}
					}

					if (flag) {
						str = newStr;
						canFal = true;
					}
				}

				if (canFal) break;
			}

			if (canFal) sb.append(str).append("\n");
			else sb.append(0).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}