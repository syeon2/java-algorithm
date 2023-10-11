import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean[] list = new boolean[31];

		for (int i = 0; i < 28; i++) {
			int num = Integer.parseInt(br.readLine());

			list[num] = true;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 30; i++) {
			if (!list[i]) sb.append(i).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
