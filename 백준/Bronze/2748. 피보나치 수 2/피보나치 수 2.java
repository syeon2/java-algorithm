import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int count = 1;
		long prev = 0;
		long next = 1;

		while (count != N) {
			count++;

			long temp = next;

			next += prev;
			prev = temp;
		}

		bw.write(String.valueOf(next));
		bw.flush();
		bw.close();
	}
}