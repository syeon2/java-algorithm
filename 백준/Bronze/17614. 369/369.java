import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int count = 0;

		for (int i = 1; i <= N; i++) {
			count += getClap(i);
		}

		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}

	public static int getClap(int num) {
		int count = 0;

		while (num != 0) {
			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) count++;
			num /= 10;
		}

		return count;
	}
}