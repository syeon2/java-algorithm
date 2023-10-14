import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= N; i++) {
			List<Integer> newList = getList(N, i);

			if (list.size() < newList.size()) {
				list = newList;
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append(" ");
		}
		
		bw.write(String.valueOf(list.size()));
		bw.newLine();
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	public static List<Integer> getList(int init, int num) {
		List<Integer> list = new ArrayList<>();
		int count = 2;

		int prev = init;
		int next = num;

		list.add(init);
		list.add(num);

		while (prev - next >= 0) {
			count++;

			int temp = next;

			next = prev - next;
			prev = temp;

			list.add(next);
		}

		return list;
	}
}