import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static int[] iList;
	static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		iList = new int[M + 1];

		backtracking(1, N, M);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }

	private static void backtracking(int index, int n, int m) {
		if (index > m) {
			for (int i = 1; i <= m; i++) {
				sb.append(iList[i]).append(" ");
			}

			sb.append("\n");
			return;
		}

		for (int i = 1; i <= n; i++) {
			iList[index] = i;
			backtracking(index + 1, n, m);
		}
	}
}