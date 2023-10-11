import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		Deque<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();

		StringTokenizer st;
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine(), " ");

			String command = st.nextToken();

			if (command.equals("push")) {
				int num = Integer.parseInt(st.nextToken());

				queue.add(num);
			} else if (command.equals("pop")) {
				if (queue.isEmpty()) sb.append(-1).append("\n");
				else {
					int num = queue.removeFirst();

					sb.append(num).append("\n");
				}
			} else if (command.equals("size")) {
				sb.append(queue.size()).append("\n");
			} else if (command.equals("empty")) {
				if (queue.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
			} else if (command.equals("front")) {
				if (queue.isEmpty()) sb.append(-1).append("\n");
                else sb.append(queue.getFirst()).append("\n");
			} else if (command.equals("back")) {
				if (queue.isEmpty()) sb.append(-1).append("\n");
                else sb.append(queue.getLast()).append("\n");
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}