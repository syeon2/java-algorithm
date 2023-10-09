import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int prev = 0;
		int next = 1;

		int count = 0;

		int N = Integer.parseInt(br.readLine());

		while (count++ != N) {
			int temp = prev;

			prev = next;
			next += temp;
		}

		bw.write(String.valueOf(prev));
		bw.flush();
		bw.close();
	}
}