import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine(), " ");

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			int min = A;
			while (true) {
				if (A % min == 0 && B % min == 0) break;
				else {
					min--;
				}
			}

			int max = A * B / min;

			sb.append(max).append(" ").append(min).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}