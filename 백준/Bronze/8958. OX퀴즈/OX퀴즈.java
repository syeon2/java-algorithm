import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int n = 0; n < N; n++) {
			char[] list = br.readLine().toCharArray();

			int total = 0;
			int count = 0;

			for (int i = 0; i < list.length; i++) {
				if (list[i] == 'O') {
					count += 1;
					total += count;
				} else {
					count = 0;
				}
			}

			sb.append(total).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
