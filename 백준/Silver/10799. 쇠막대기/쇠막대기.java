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

        int answer = 0;

		Stack<Character> stack = new Stack<>();
		char[] list = br.readLine().toCharArray();

		for (int i = 0; i < list.length; i++) {
			if (list[i] == '(') {
				stack.push('(');
			} else {
				stack.pop();

				if (list[i - 1] == '(') {
					answer += stack.size();
				} else {
					answer++;
				}
			}
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }
}
