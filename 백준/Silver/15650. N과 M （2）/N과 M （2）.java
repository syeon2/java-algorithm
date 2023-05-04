import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();

	static int[] list = new int[10];

    public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		recur(1, N, M);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }

	public static void recur(int index, int n, int m) {
		if (index > m) {
			for (int i = 1; i <= m; i++) {
				sb.append(list[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 1; i <= n; i++) {
			list[index] = i;
			if (list[index - 1] >= list[index]) continue;
			recur(index + 1, n, m);
		}
	}
}