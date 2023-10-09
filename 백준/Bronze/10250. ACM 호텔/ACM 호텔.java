import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());

			int ho = P / H;
			if (P % H > 0) ho++;

			int floor = P % H;
			if (floor == 0) floor = H;

			sb.append(floor);

			if (ho < 10) sb.append(0);
			sb.append(ho).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}