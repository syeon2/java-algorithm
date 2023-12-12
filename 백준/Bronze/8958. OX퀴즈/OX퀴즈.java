import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] list = br.readLine().split("");

			int score = 0;
			int count = 1;
			for (int k = 0; k < list.length; k++) {
				if (list[k].equals("O")) {
					score += count;

					count++;
				} else {
					count = 1;
				}
			}

			bw.write(String.valueOf(score));
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}