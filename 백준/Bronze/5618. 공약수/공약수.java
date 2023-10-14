import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] list = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			list[i] = num;

			if (min > num) min = num;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= min; i++) {

			boolean flag = false;
			for (int k = 0; k < N; k++) {
				if (list[k] % i != 0) {
					flag = true;
					break;
				}
			}

			if (!flag) sb.append(i).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();


	}
}