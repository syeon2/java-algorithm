import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		Stack<String> left = new Stack<>();
		Stack<String> right = new Stack<>();

		char[] str = br.readLine().toCharArray();
		for (char c : str) {
			left.push(String.valueOf(c));
		}

		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++ ){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			String cmd = st.nextToken();

			if (cmd.equals("L")) {
				if (!left.isEmpty()) right.push(left.pop());
			} else if (cmd.equals("D")) {
				if (!right.isEmpty()) left.push(right.pop());
			} else if (cmd.equals("B")) {
				if (!left.isEmpty()) left.pop();
			} else {
				String s = st.nextToken();

				left.push(s);
			}
		}

		while (!left.isEmpty()) {
			right.push(left.pop());
		}

		while (!right.isEmpty()) {
			sb.append(right.pop());
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
