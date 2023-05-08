import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int[] list = new int[10];
	static int[] answer = new int[10];
	static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] temp = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			temp[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(temp);

		int k = 0;
		int x = temp[0];
		int c = 1;
		for (int i = 1; i < N; i++) {
			if (x == temp[i]) c += 1;
			else {
				list[k] = x;
				x = temp[i];
				k += 1;
				c = 1;
			}
		}
		list[k] = x;
		N = k + 1;
		recur(0, N, M);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }

	public static void recur(int index, int n, int m) {
		if (m == index) {
			for (int i = 0; i < m; i++) {
				sb.append(list[answer[i]]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < n; i++) {
			answer[index] = i;
			recur(index + 1, n, m);
		}
	}
}