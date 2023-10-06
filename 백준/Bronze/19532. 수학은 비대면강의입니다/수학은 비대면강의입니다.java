import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();
		if (a == 0 || d == 0) {
			int x = ((c * e) - (f * b)) / ((a * e) - (d * b));
			int y = (c - (a * x)) / b;

			sb.append(x).append(" ").append(y);
		} else {
			int y = ((c * d) - (f * a)) / ((b * d) - (e * a));
			int x = ((c - (b * y)) / a);

			sb.append(x).append(" ").append(y);
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
