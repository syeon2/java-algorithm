import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		boolean[] ar = new boolean[N + 1];

		ar[1] = true;
		for (int i = 2; i <= N; i++) {

			for (int k = i + i; k <= N; k += i) {
				ar[k] = true;
			}
		}

		for (int i = M; i <= N; i++) {
			if (!ar[i]) sb.append(i).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}