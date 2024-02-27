import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());

			int ans = 0;

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			for (int i = 1; i <= a; i++) {

				for (int k = 1; k <= b; k++) {

					for (int j = 1; j <= c; j++) {
						if (i % k == k % j && j % i == i % k) ans++;
					}
				}
			}

			sb.append(ans).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
