import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		boolean[] cache = new boolean[10001];

		for (int i = 1; i <= 10000; i++) {
			int num = d(i);

			if (num <= 10000) {
				cache[num] = true;
			}
		}

		for (int i = 1; i <= 10000; i++) {
			if (!cache[i]) {
				sb.append(i).append("\n");
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	public static int d(int num) {
		int temp = num;

		while (temp > 0) {
			num += (temp % 10);
			temp /= 10;
		}
		
		return num;
	}
}
