import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int X = Integer.parseInt(br.readLine());

		int cnt = 1;
		while (X - cnt > 0) {
			X -= cnt;
			cnt++;
		}

		StringBuilder sb = new StringBuilder();

		if (cnt % 2 == 1) sb.append(cnt - X + 1).append("/").append(X);
		else sb.append(X).append("/").append(cnt - X + 1);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
