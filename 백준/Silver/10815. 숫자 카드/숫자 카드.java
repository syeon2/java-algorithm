import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		boolean[] minusList = new boolean[10000001];
		boolean[] plusList = new boolean[10000001];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());

			if (num >= 0) plusList[num] = true;
			else minusList[num * -1] = true;
		}

		StringBuilder sb = new StringBuilder();

		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());

			if (num >= 0) {
				if (plusList[num]) sb.append(1).append(" ");
				else sb.append(0).append(" ");
			} else {
				if (minusList[num * -1]) sb.append(1).append(" ");
				else sb.append(0).append(" ");
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}