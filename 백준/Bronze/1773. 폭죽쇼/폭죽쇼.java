import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());

		int[] list = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}

		boolean[] time = new boolean[T + 1];

		for (int i = 1; i <= N; i++) {

			int s = list[i];

			int cnt = 1;
			while (s * cnt <= T) {
				time[s * cnt++] = true;
			}
		}

		int ans = 0;
		for (int i = 0; i < time.length; i++) {
			if (time[i]) ans++;
		}

		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
