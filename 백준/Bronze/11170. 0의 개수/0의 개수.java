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

			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			int count = 0;

			for (int i = start; i <= end; i++) {
				if (i == 0) count++;
				else count += countingZero(i);
			}

			bw.write(String.valueOf(count));
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}

	public static int countingZero(int num) {
		int temp = num;

		int count = 0;
		while (temp != 0) {
			if (temp % 10 == 0) count++;

			temp /= 10;
		}

		return count;
	}
}
