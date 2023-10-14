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

		int count = 1;
		StringBuilder sb = new StringBuilder();
		sb.append("<");

		while (queue.size() != 1) {
			if (count == K) {
				int num = queue.remove();

				sb.append(num).append(", ");
				count = 1;
			} else {
				queue.add(queue.remove());
				count++;
			}
		}

		sb.append(queue.remove()).append(">");

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}