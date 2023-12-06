import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i < 10; i++) {
			sb.append(num).append(" * ").append(i).append(" = ").append(num * i).append('\n');
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}