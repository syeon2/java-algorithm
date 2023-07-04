import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] nList = new int[N];
		int[] mList = new int[M];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			nList[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			mList[i] = Integer.parseInt(st.nextToken());
		}

		int n = 0;
		int m = 0;

		while (n < N && m < M) {
			if (nList[n] < mList[m]) {
				sb.append(nList[n++]).append(" ");
			} else {
				sb.append(mList[m++]).append(" ");
			}
		}

		while (n < N) {
			sb.append(nList[n++]).append(" ");
		}

		while (m < M) {
			sb.append(mList[m++]).append(" ");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
