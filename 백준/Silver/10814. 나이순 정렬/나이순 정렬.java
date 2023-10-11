import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		String[][] list = new String[N][2];

		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			list[i][0] = st.nextToken();
			list[i][1] = st.nextToken();
		}

		Arrays.sort(list, (a, b) -> {
			return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
		});

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(list[i][0]).append(" ").append(list[i][1]).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}