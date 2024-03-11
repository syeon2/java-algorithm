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

            boolean ans = true;

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                    stack.add(str.charAt(i));
                } else if (str.charAt(i) == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
                    else {
                        ans = false;
                        break;
                    }
                } else if (str.charAt(i) == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') stack.pop();
                    else {
                        ans = false;
                        break;
                    }
                }
            }

            if (ans && stack.isEmpty()) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}