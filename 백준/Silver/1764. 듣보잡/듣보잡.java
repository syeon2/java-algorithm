import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Set<String> set = new HashSet<>();

		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}

		int count = 0;
		List<String> list = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			String str = br.readLine();

			if (set.contains(str)) {
				count++;
				list.add(str);
			}
		}

		Collections.sort(list);

		bw.write(String.valueOf(count));
		bw.newLine();

		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i));
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
