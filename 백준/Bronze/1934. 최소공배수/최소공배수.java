import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;

		StringBuilder sb = new StringBuilder();
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine(), " ");

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			sb.append(A * B / gcd(Math.min(A, B), Math.max(A, B))).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	public static int gcd(int a, int b) {
		if (b == 0) return a;
		else return gcd(b, a % b);
	}
}