import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int L = -1;
		int W = -1;

		for (int i = 3; i <= 5000; i++) {

			for (int k = 3; k <= 5000; k++) {
				if (((i * 2) + (k * 2) - 4 == R) && ((i - 2) * (k - 2) == B)) {
					L = i;
					W = k;
					break;
				}
			}

			if (L != -1) break;
		}

		bw.write(String.format("%d %d", Math.max(L, W), Math.min(L, W)));
		bw.flush();
		bw.close();
	}
}
