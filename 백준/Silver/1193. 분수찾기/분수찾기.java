import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int X = Integer.parseInt(br.readLine());

		int total = 0;
		int count = 0;

		while (total < X) {
			count++;
			total += count;
		}

		StringBuilder sb = new StringBuilder();

		if (total == X) {
			if (count % 2 == 0) {
				sb.append(count).append("/").append(1);
			} else {
				sb.append(1).append("/").append(count);
			}
		} else {
			if (count % 2 == 0) {
				int bottom = 1;
				while (total != X) {
					total--;

					count--;
					bottom++;
				}

				sb.append(count).append("/").append(bottom);
			} else {
				int top = 1;

				while (total != X) {
					total--;

					count--;
					top++;
				}

				sb.append(top).append("/").append(count);
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
