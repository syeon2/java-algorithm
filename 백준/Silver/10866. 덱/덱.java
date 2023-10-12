import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		Deque<Integer> queue = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			String command = st.nextToken();

			if (command.equals("push_front")) {
				int num = Integer.parseInt(st.nextToken());

				queue.addFirst(num);
			} else if (command.equals("push_back")) {
				int num = Integer.parseInt(st.nextToken());

				queue.addLast(num);
			} else if (command.equals("pop_front")) {
				if (queue.isEmpty()) sb.append(-1).append("\n");
				else {
					sb.append(queue.removeFirst()).append("\n");
				}
			} else if (command.equals("pop_back")) {
				if (queue.isEmpty()) sb.append(-1).append("\n");
				else {
					sb.append(queue.removeLast()).append("\n");
				}
			} else if (command.equals("size")) {
				sb.append(queue.size()).append("\n");
			} else if (command.equals("front")) {
				if (queue.isEmpty()) sb.append(-1).append("\n");
				else sb.append(queue.getFirst()).append("\n");
			} else if (command.equals("back")) {
				if (queue.isEmpty()) sb.append(-1).append("\n");
				else sb.append(queue.getLast()).append("\n");
			} else if (command.equals("empty")) {
				if (queue.isEmpty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
