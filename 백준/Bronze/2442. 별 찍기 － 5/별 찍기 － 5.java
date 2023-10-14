import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {

			for (int k = 1; k <= N - i; k++) {
				sb.append(" ");
			}

			for (int k = 1; k <= (i * 2) - 1; k++) {
				sb.append("*");
			}

			sb.append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}