import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int[] nList;
	static int[] pos;
	static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		nList = new int[N];
		pos = new int[M];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			nList[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(nList);
		backtracking(0, N, M);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }

	private static void backtracking(int idx, int n, int m) {
		if (idx == m) {
			for (int i = 0; i < m; i++) {
				sb.append(pos[i]).append(" ");
			}

			sb.append("\n");
			return;
		}

		for (int i = 0; i < n; i++) {
			if (idx != 0 && pos[idx - 1] >= nList[i]) continue;

			pos[idx] = nList[i];
			backtracking(idx + 1, n, m);
		}
	}
}