import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] list = br.readLine().split(" ");
		int E = Integer.parseInt(list[0]);
		int S = Integer.parseInt(list[1]);
		int M = Integer.parseInt(list[2]);

		int e = 1;
		int s = 1;
		int m = 1;

		int cur = 1;

		while (true) {
			if (E == e && S == s && M == m) break;

			if (e == 15) e = 1;
			else e++;

			if (s == 28) s = 1;
			else s++;

			if (m == 19) m = 1;
			else m++;

			cur++;
		}

		System.out.println(cur);
	}
}