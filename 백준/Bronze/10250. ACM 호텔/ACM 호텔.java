import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] info = br.readLine().split(" ");

			int H = Integer.parseInt(info[0]);
			int W = Integer.parseInt(info[1]);
			int c = Integer.parseInt(info[2]);

			int next = 1;
			int floor = 1;

			while (c != 1) {
				if (floor == H) {
					floor = 1;
					next += 1;
				} else floor++;

				c--;
			}

			System.out.print(floor);
			if (next < 10) System.out.println("0" + next);
			else System.out.println(next);
		}
	}
}
