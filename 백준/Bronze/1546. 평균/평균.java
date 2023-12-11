import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] list = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int max = 0;
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			list[i] = num;

			if (max < num) max = num;
		}

		double ans = 0;

		for (int i = 0; i < N; i++) {
			ans += (double) list[i] / (double) (max * 100);
		}

		bw.write(String.valueOf(ans / N * 10000));
		bw.flush();
		bw.close();
	}
}