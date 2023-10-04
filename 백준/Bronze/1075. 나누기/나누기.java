import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int F = Integer.parseInt(br.readLine());

		int init = (N / 100) * 100;

		for (int i = init; i < init + 100; i++) {
			if (i % F == 0) {
				String str = String.valueOf(i);

				System.out.println(str.substring(str.length()- 2));
				return;
			}
		}
	}
}