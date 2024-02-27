import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int B = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());

			if (B == 0 && N == 0) break;

			int min = Integer.MAX_VALUE;
			int ans = 0;

			while (true) {
				int prod = 1;

				for (int i = 0; i < N; i++) {
					prod *= (ans + 1);
				}

				if (Math.abs(B - prod) <= min) {
					ans++;
					min = Math.abs(B - prod);
				} else break;
			}

			sb.append(ans).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
