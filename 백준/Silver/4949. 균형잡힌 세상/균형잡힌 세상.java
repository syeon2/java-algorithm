import java.io.*;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();
		String str;

		while (!(str = br.readLine()).equals(".")) {

			Stack<Character> stack = new Stack<>();
			boolean flag = true;

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '(' || str.charAt(i) == '[') stack.add(str.charAt(i));
				else if (str.charAt(i) == ')') {
					if (stack.isEmpty()) {
						sb.append("no").append("\n");
						flag = false;
						break;
					}

					if (stack.peek() == '(') stack.pop();
					else {
						sb.append("no").append("\n");
						flag = false;
						break;
					}
				} else if (str.charAt(i) == ']') {
					if (stack.isEmpty()) {
						sb.append("no").append("\n");
						flag = false;
						break;
					}

					if (stack.peek() == '[') stack.pop();
					else {
						sb.append("no").append("\n");
						flag = false;
						break;
					}
				}
			}

			if (flag && stack.isEmpty()) sb.append("yes").append("\n");
			if (flag && !stack.isEmpty()) sb.append("no").append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
