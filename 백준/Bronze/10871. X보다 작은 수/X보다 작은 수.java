import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] info = br.readLine().split(" ");
		int N = Integer.parseInt(info[0]);
		int X = Integer.parseInt(info[1]);

		String[] list = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(list[i]);

			if (X > num) System.out.print(num + " ");
		}
	}
}
