import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		Set<String> set = new HashSet<>();
		Queue<String> queue = new LinkedList<>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			String name = br.readLine();
			set.add(name);
		}

		int count = 0;
		for (int i = 0; i < M; i++) {
			String name = br.readLine();
			boolean remove = set.remove(name);

			if (remove) {
				count++;
				queue.add(name);
			}
		}

		sb.append(count).append("\n");
		String[] array = queue.toArray(String[]::new);
		Arrays.sort(array);
		
		Arrays.stream(array).forEach(s -> sb.append(s).append("\n"));

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
