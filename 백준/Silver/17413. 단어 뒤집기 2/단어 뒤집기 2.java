import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		Deque<Character> queue = new LinkedList<>();
		Stack<Character> stack = new Stack<>();
		char[] list = br.readLine().toCharArray();

		boolean flag = false;
		for (int i = 0; i < list.length; i++) {

			if (list[i] == '<') {

				while (!stack.isEmpty()) {
					queue.add(stack.pop());
				}

				queue.add(list[i]);
				flag = true;
			} else if (list[i] == '>') {
				queue.add(list[i]);
				flag = false;
			} else if (list[i] == ' ') {
				if (flag) queue.add(list[i]);
				else {
					while(!stack.isEmpty()) {
						queue.add(stack.pop());
					}
					queue.add(list[i]);
				}
			} else {
				if (flag) {
					queue.add(list[i]);
				} else {
					stack.push(list[i]);
				}
			}
		}

		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}

		while (!queue.isEmpty()) {
			sb.append(queue.removeFirst());
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
