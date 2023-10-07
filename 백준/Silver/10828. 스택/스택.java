import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<>();

		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine(), " ");

			String command = st.nextToken();

			if (command.equals("push")) {
				int num = Integer.parseInt(st.nextToken());

				stack.push(num);
			} else if (command.equals("pop")) {
				if (stack.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					int num = stack.pop();

					sb.append(num).append("\n");
				}
			} else if (command.equals("size")) {
				sb.append(stack.size()).append("\n");
			} else if (command.equals("empty")) {
				if (stack.isEmpty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
			} else {
				if (stack.isEmpty()) sb.append(-1).append("\n");
				else sb.append(stack.peek()).append("\n");
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}