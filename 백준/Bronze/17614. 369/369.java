import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int ans = 0;

		for (int i = 1; i <= N; i++) {
			int clap = countClap(i);

			ans += clap;
		}

		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}

	public static int countClap(int n) {
		int cnt = 0;

		while (n > 0) {
			if (n % 10 == 3 || n % 10 == 6 || n % 10 == 9) cnt++;
			n /= 10;
		}

		return cnt;
	}
}
