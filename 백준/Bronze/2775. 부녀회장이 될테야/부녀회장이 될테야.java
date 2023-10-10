import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int n = 0; n < N; n++) {
			int floor = Integer.parseInt(br.readLine());
			int ho = Integer.parseInt(br.readLine());

			int[][] list = new int[floor + 1][ho + 1];

			for (int i = 0; i <= floor; i++) {

				for (int k = 1; k <= ho; k++) {
					if (i == 0) list[i][k] = k;
					else {
						int total = 0;

						for (int j = 1; j <= k; j++) {
							total += list[i - 1][j];
						}

						list[i][k] = total;
					}
				}
			}

			bw.write(String.valueOf(list[floor][ho]));
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}