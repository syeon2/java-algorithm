import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		if (N % 5 == 0) {
			bw.write(String.valueOf(N / 5));
		} else {
			int three = 0;
			int five = 0;

			int count = 0;

			while ((N - (5 * count)) / 3 > 0) {
				if ((N - (5 * count)) % 3 == 0) {
					three = (N - (5 * count)) / 3;
					five = count++;
				} else count++;
			}
			if (three == 0) bw.write(String.valueOf(-1));
			else bw.write(String.valueOf(three + five));
		}

		bw.flush();
		bw.close();
	}
}
