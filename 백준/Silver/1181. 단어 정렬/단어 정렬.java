import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String[] list = new String[N];
		for (int i = 0; i < N; i++) {
			list[i] = br.readLine();
		}

		Arrays.sort(list, (a, b) -> {
			if (a.length() == b.length()) {
                return a.compareTo(b);
			}

			return a.length() - b.length();
		});

		StringBuilder sb = new StringBuilder();
		String pre = "";
		for (int i = 0; i < N; i++) {
			if (!pre.equals(list[i])) sb.append(list[i]).append("\n");

			pre = list[i];

		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
