import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int q = 0; q < N; q++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());

			double avg = 0;
			int[] list = new int[n];
			for (int i = 0; i < n; i++) {
				list[i] = Integer.parseInt(st.nextToken());
				avg += list[i];
			}

			avg /= n;

			int cnt = 0;
			for (int i = 0; i < n; i++) {
				if (avg < list[i]) cnt++;
			}

			sb.append(String.format("%.3f", (double) cnt / n * 100)).append("%\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
