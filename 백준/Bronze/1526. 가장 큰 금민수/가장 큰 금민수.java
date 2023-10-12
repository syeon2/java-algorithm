import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int answer = getNum(N);

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}

	public static int getNum(int num) {
		int temp = num;

		while (true) {

			boolean flag = true;
			int temp2 = temp;

			while (temp2 != 0) {
				if (!(temp2 % 10 == 4 || temp2 % 10 == 7)) {
					flag = false;
					break;
				}

				temp2 /= 10;
			}

			if (flag) break;
			else temp--;
		}

		return temp;
	}
}