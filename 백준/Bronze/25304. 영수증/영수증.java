import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int total = Integer.parseInt(br.readLine());

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine(), " ");

			int price = Integer.parseInt(st.nextToken());
			int count = Integer.parseInt(st.nextToken());

			total -= (price * count);

			if (total < 0) break;
		}

		if (total == 0) bw.write("Yes");
		else bw.write("No");

		bw.flush();
		bw.close();
	}
}