import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		Deque<Integer> queue = new LinkedList<>();

		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String cmd = st.nextToken();

			if (cmd.equals("push")) {
				int n = Integer.parseInt(st.nextToken());
				queue.add(n);
			} else if (cmd.equals("pop")) {
				if (queue.isEmpty()) {
					sb.append(-1).append("\n");
				}
				else sb.append(queue.remove()).append("\n");
			} else if (cmd.equals("size")) {
				sb.append(queue.size()).append("\n");
			} else if (cmd.equals("empty")) {
				if (queue.isEmpty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
			} else if (cmd.equals("front")) {
				if (queue.isEmpty()) sb.append(-1).append("\n");
				else sb.append(queue.peekFirst()).append("\n");
			} else if (cmd.equals("back")) {
				if (queue.isEmpty()) sb.append(-1).append("\n");
				else sb.append(queue.peekLast()).append("\n");
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
