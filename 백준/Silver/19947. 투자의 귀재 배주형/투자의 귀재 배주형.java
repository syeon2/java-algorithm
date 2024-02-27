import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int H = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());

		int[] years = new int[Y + 1];
		years[0] = H;

		for (int i = 1; i <= Y; i++) {
			// 1년
			if (i - 1 >= 0) {
				int interest = years[i - 1] * 5 / 100;

				years[i] = Math.max(years[i], interest + years[i - 1]);
			}

			if (i - 3 >= 0) {
				int interest = years[i - 3] * 20 / 100;

				years[i] = Math.max(years[i], interest + years[i - 3]);
			}

			if (i - 5 >= 0) {
				int interest = years[i - 5] * 35 / 100;

				years[i] = Math.max(years[i], interest + years[i - 5]);
			}
		}

		bw.write(String.valueOf(years[Y]));
		bw.flush();
		bw.close();
	}
}
