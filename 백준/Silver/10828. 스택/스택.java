import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			String cmd = st.nextToken();

			if (cmd.equals("push")) {
				stack.push(Integer.parseInt(st.nextToken()));
			} else if (cmd.equals("pop")) {
				if (stack.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					Integer poppedNum = stack.pop();

					sb.append(poppedNum).append("\n");
				}
			} else if (cmd.equals("size")) {
				sb.append(stack.size()).append("\n");
			} else if (cmd.equals("empty")) {
				if (stack.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			} else {
				if (stack.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					Integer topNum = stack.peek();

					sb.append(topNum).append("\n");
				}
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
