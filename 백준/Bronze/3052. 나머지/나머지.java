import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean[] cache = new boolean[43];
		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());

			int remain = num % 42;
			cache[remain] = true;
		}

		int count = 0;
		for (int i = 0; i < cache.length; i++) {
			if (cache[i]) count++;
		}

		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
}
