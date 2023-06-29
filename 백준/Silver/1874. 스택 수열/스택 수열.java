import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

		Stack<Integer> stack = new Stack<>();
        int T = Integer.parseInt(br.readLine());

		int maxNum = 0;
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());

			if (N > maxNum) {
				for (int i = maxNum + 1; i <= N; i++) {
					stack.push(i);
					sb.append("+").append("\n");
					maxNum = i;
				}

				stack.pop();
				sb.append("-").append("\n");
			} else {
				while (true) {
					if (!stack.isEmpty()) {
						Integer pop = stack.pop();
						sb.append("-").append("\n");

						if (pop == N) break;
					} else {
						bw.write("NO");
						bw.flush();
						bw.close();
						return;
					}
				}
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
