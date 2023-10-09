import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int k = 1 - Integer.parseInt(st.nextToken());
		int q = 1 - Integer.parseInt(st.nextToken());
		int l = 2 - Integer.parseInt(st.nextToken());
		int b = 2 - Integer.parseInt(st.nextToken());
		int kn = 2 - Integer.parseInt(st.nextToken());
		int p = 8 - Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();
		sb.append(k).append(" ").append(q).append(" ").append(l).append(" ")
			.append(b).append(" ").append(kn).append(" ").append(p);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}