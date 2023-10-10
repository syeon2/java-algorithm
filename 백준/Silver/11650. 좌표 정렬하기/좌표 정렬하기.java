import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[][] list = new int[N][2];

		StringTokenizer st;
		for (int i = 0; i < list.length; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			list[i][0] = x;
			list[i][1] = y;
		}

		Arrays.sort(list, (a, b) -> {
			if (a[0] == b[0]) {
				return a[1] - b[1];
			} else {
				return a[0] - b[0];
			}
		});

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.length; i++) {
			sb.append(list[i][0]).append(" ").append(list[i][1]).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}