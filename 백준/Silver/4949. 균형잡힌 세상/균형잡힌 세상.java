import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if (str.equals(".")) break;

            Stack<Character> stack = new Stack<>();

            boolean balanced = true;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (c == '(' || c == '[') stack.add(c);
                else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() == '[') {
                        balanced = false;
                        break;
                    }
                    else if (stack.peek() == '(') stack.pop();
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() == '(') {
                        balanced = false;
                        break;
                    }
                    else if (stack.peek() == '[') stack.pop();
                }
            }

            if (!stack.isEmpty()) balanced = false;

            if (balanced) sb.append("yes");
            else sb.append("no");

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}