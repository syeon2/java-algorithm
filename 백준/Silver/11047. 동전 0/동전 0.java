import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}

		int answer = 0;
		for (int i = list.length - 1; i >= 0; i--) {
			if (K == 0) break;

			if (K % list[i] == K) continue;

			answer += K / list[i];
			K = K % list[i];
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}
}