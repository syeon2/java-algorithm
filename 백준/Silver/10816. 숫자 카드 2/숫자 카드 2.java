import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		Map<Integer, Integer> map = new HashMap<>();

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());

			if (map.containsKey(num)) map.put(num, map.get(num) + 1);
			else map.put(num, 1);
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());

			if (map.containsKey(num)) sb.append(map.get(num)).append(" ");
			else sb.append(0).append(" ");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
