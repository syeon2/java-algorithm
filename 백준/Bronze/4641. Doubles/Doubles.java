import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		while (true) {
			Integer[] list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

			if (list[0] == -1) break;

			boolean[] isExist = new boolean[250];

			for (int i = 0; i < list.length - 1; i++) {
				int idx = list[i];

				isExist[idx] = true;
			}

			int cnt = 0;
			for (int i = 0; i < list.length - 1; i++) {
				int idx = list[i] * 2;

				if (isExist[idx]) cnt++;
			}

			sb.append(cnt).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
