import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			String[] list = br.readLine().split(" ");

			int A = Integer.parseInt(list[0]);
			int B = Integer.parseInt(list[1]);

			sb.append("Case #").append(i + 1)
				.append(": ")
				.append(A).append(" + ").append(B)
				.append(" = ").append(A + B)
				.append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
