import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		int total = 0;
		int min = -1;

		int idx = 1;
		while (true) {
			int num = idx * idx;

			if (num >= M && num <= N) {
				total += num;

				if (min == -1) min = num;
			}

			idx++;

			if (idx * idx > N) break;
		}

		if (min == -1) {
			System.out.println(-1);
		} else {
			System.out.println(total);
			System.out.println(min);
		}
	}
}