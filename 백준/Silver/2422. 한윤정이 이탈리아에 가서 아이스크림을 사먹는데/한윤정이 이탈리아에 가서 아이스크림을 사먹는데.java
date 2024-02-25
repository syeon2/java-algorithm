import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		boolean[][] isBad = new boolean[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			isBad[a][b] = true;
			isBad[b][a] = true;
		}

		int ans = 0;
		for (int i = 1; i <= N; i++) {

			for (int k = i + 1; k <= N; k++) {
				if (isBad[i][k] || isBad[k][i]) continue;

				for (int j = k + 1; j <= N; j++) {
					if (isBad[i][j] || isBad[j][i] || isBad[k][j] ||isBad[j][k]) continue;

					ans++;
				}
			}
		}

		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
