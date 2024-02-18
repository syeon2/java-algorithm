import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		List<Integer> list = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());

			String cmd = st.nextToken();

			if (cmd.equals("push")) {
				int num = Integer.parseInt(st.nextToken());

				list.add(num);
			} else if (cmd.equals("pop")) {
				if (list.isEmpty()) sb.append("-1\n");
				else sb.append(list.remove(list.size() - 1)).append("\n");
			} else if (cmd.equals("size")) {
				sb.append(list.size()).append("\n");
			} else if (cmd.equals("empty")) {
				if (list.isEmpty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
			} else {
				if (list.isEmpty()) sb.append(-1).append("\n");
				else sb.append(list.get(list.size() - 1)).append("\n");
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
