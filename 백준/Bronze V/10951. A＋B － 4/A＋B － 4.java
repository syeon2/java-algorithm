import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		while (true) {
			String str = br.readLine();

			if (str == null) break;

			Integer[] list = Arrays.stream(str.split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
			int a = list[0];
			int b = list[1];

			sb.append(a + b).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}