import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		boolean[] list = new boolean[10];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < K; i++) {
			int idx = Integer.parseInt(st.nextToken());

			list[idx] = true;
		}

		for (int i = N; i >= 1; i--) {
			boolean flag = true;
			int num = i;

			while (num > 0) {
				int temp = num % 10;

				if (!list[temp]) {
					flag = false;
					break;
				}

				num /= 10;
			}

			if (flag) {
				bw.write(String.valueOf(i));
				break;
			}
		}

		bw.flush();
		bw.close();
	}
}