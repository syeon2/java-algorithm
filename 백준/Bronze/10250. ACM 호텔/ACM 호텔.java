import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());

			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());

			int floor = P % H == 0 ? H : P % H;
			int number = P % H == 0 ? P / H : (P / H) + 1;

			if (number >= 10) sb.append(floor).append(number).append("\n");
			else sb.append(floor).append("0").append(number).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
