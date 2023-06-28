import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;

public class Main {

	static Stack<String> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			String[] list = br.readLine().split("");

			boolean flag = true;

			for (String s : list) {
				if (s.equals("(")) {
					stack.push("(");
				} else {
					if (stack.isEmpty()) {
						flag = false;
						break;
					} else {
						stack.pop();
					}
				}
			}

			if (!flag || !stack.isEmpty()) sb.append("NO").append("\n");
			else sb.append("YES").append("\n");

			stack.clear();
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
