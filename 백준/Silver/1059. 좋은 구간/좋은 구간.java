import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int L = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(br.readLine());

		int min = 0;
		int max = Integer.MAX_VALUE;

		for (int i = 0; i < L; i++) {
			int num = Integer.parseInt(st.nextToken());

			if (N > num && min < num) min = num;
			if (N < num && max > num) max = num;

			if (N == num) {
				bw.write(String.valueOf(0));
				bw.flush();
				bw.close();
				return;
			}
		}

		int total = (N - min) * (max - N) - 1;

		bw.write(String.valueOf(total));
		bw.flush();
		bw.close();
	}
}