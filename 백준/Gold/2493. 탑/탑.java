import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Node[] list = new Node[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = new Node(Integer.parseInt(st.nextToken()), i);
        }

        int[] ans = new int[N + 1];
        ans[1] = 0;

        Stack<Node> stack = new Stack<>();
        for (int i = 1; i <= N; i++) {
            if (stack.isEmpty()) {
                stack.add(list[i]);
                ans[i] = 0;
            } else {
                while (!stack.isEmpty() && stack.peek().num < list[i].num) {
                    Node poped = stack.pop();

                    if (!stack.isEmpty()) ans[poped.idx] = stack.peek().idx;
                    else ans[poped.idx] = 0;
                }

                stack.add(list[i]);
            }
        }

        while (!stack.isEmpty()) {
            Node poped = stack.pop();

            if (stack.isEmpty()) ans[poped.idx] = 0;
            else {
                ans[poped.idx] = stack.peek().idx;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(ans[i]).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static class Node {
        public int num;
        public int idx;

        public Node(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }
    }
}