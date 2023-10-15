import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(br.readLine(), " ");

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			if (A == 0 && B == 0) break;
			else {
				if (A > B) {
					if (A % B == 0) sb.append("multiple").append("\n");
					else sb.append("neither").append("\n");
				} else {
					if (B % A == 0) sb.append("factor").append("\n");
					else sb.append("neither").append("\n");
				}
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}