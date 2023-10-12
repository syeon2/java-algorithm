import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}

		int count = 0;

		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while (queue.size() != 1) {
			count++;

			if (count == K) {
				int num = queue.remove();

				sb.append(num).append(", ");
				count = 0;
			} else {
				queue.add(queue.remove());
			}
		}

		sb.append(queue.remove()).append(">");

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}