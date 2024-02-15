import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int n = 0; n < N; n++) {
			Integer[] list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
			int a = list[0];
			int b = list[1];

			sb.append("Case #").append(n + 1).append(": ").append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
