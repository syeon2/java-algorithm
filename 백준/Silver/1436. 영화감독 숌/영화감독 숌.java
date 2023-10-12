import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		if (N == 1) bw.write("666");
		else {
			int count = 1;
			int total = 666;

			while (count != N) {
				count += 1;

				total = nextNum(total);
			}

			bw.write(String.valueOf(total));
		}

		bw.flush();
		bw.close();
	}

	public static int nextNum(int num) {
		int temp = num + 1;

		while (true) {
			int count = 0;
			boolean flag = false;

			int temp2 = temp;

			while (temp2 != 0) {
				if (temp2 % 10 == 6) {
					count++;

					if (count >= 3) flag = true;
				}
				else count = 0;

				temp2 /= 10;
			}

			if (flag) break;
			else temp++;
		}

		return temp;
	}
}