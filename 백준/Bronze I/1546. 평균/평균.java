import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] list = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		int max = 0;

		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st.nextToken());

			if (max < list[i]) max = list[i];
		}

		double avg = 0;

		for (int i = 0; i < N; i++) {
			avg += (double) list[i] / max * 100;
		}

		bw.write(String.valueOf(avg / N));
		bw.flush();
		bw.close();
	}
}
