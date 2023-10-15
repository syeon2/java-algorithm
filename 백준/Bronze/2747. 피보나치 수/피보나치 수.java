import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int prev = 0;
		int cur = 1;

		int count = 1;

		if (N == 0) bw.write(String.valueOf(prev));
		else {
			while (count != N) {
				count++;

				int temp = cur;
				cur += prev;
				prev = temp;
			}

			bw.write(String.valueOf(cur));
		}

		bw.flush();
		bw.close();
	}
}