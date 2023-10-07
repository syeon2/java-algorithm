import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int total = 0;

		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());

			if (Math.abs(100 - total) > Math.abs(100 - (total + num))) {
				total += num;
			} else if (Math.abs(100 - total) == Math.abs(100 - (total + num))) {
				total += num;
				break;
			} else break;
		}

		bw.write(String.valueOf(total));
		bw.flush();
		bw.close();
	}
}
