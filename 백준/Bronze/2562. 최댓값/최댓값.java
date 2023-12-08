import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int max = 0;
		int index = -1;

		for (int i = 1; i <= 9; i++) {
			int num = Integer.parseInt(br.readLine());

			if (num > max) {
				max = num;
				index = i;
			}
		}

		bw.write(String.valueOf(max));
		bw.write(" ");
		bw.write(String.valueOf(index));

		bw.flush();
		bw.close();
	}
}