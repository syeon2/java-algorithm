import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] list = new int[7];

		int count = 0;
		for (int i = 0; i < 3; i++) {
			int num = Integer.parseInt(st.nextToken());

			list[num]++;

			if (count < list[num]) count = list[num];
		}

		int idx = 0;
		int big = 0;

		for (int i = 1; i < 7; i++) {
			if (list[i] == count) {
				idx = i;
			}

			if (list[i] > 0) big = i;
		}

		if (count == 3) {
			bw.write(String.valueOf(10000 + (idx * 1000)));
		} else if (count == 2) {
			bw.write(String.valueOf(1000 + (idx * 100)));
		} else {
			bw.write(String.valueOf(100 * big));
		}

		bw.flush();
		bw.close();
	}
}