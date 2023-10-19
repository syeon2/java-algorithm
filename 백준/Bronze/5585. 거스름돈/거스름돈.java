import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = 1000 - Integer.parseInt(br.readLine());

		int count = 0;
		if (N >= 500) {
			count += (N / 500);

			N = N % 500;
		}

		if (N >= 100) {
			count += (N / 100);

			N = N % 100;
		}

		if (N >= 50) {
			count += (N / 50);

			N = N % 50;
		}

		if (N >= 10) {
			count += (N / 10);

			N = N % 10;
		}

		if (N >= 5) {
			count += (N / 5);

			N = N % 5;
		}

		if (N >= 1) {
			count += N;
		}

		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
}