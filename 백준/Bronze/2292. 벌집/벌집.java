import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int count = 1;

		int current = 1;

		while (current < N) {
			current = current + (count++ * 6);
		}

		System.out.println(count);
	}
}
