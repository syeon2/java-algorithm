import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] list = br.readLine().split(" ");
		int N = Integer.parseInt(list[0]);
		int K = Integer.parseInt(list[1]);

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				K--;
			}

			if (K == 0) {
				System.out.println(i);
				return;
			}
		}

		System.out.println(0);
	}
}
