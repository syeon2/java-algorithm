import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static StringBuilder sb = new StringBuilder();
	static int[] nList = new int[9];
	static boolean[] check = new boolean[9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
			for (int i = 1; i <= 8; i++) {
				if (nList[i] != 0) sb.append(nList[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 1; i <= n; i++) {
			if (check[i]) continue;
			check[i] = true; nList[index] = i;
			recur(index + 1, n, m);
			check[i] = false;
		}
	}
}