import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine(), " ");

			int C = Integer.parseInt(st.nextToken());

			int[] list = new int[C];
			int total = 0;
			for (int c = 0; c < C; c++) {
				list[c] = Integer.parseInt(st.nextToken());
				total += list[c];
			}

			double avg = (double) total / (double) (100 * C) * 100;

			int count = 0;
			for (int i = 0; i < list.length; i++) {
				if (avg < list[i]) count++;
			}

			double answer = (double) count / (double) C * 100;

			System.out.printf("%.3f", answer);
			System.out.println("%");
		}
	}
}