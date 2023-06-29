import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Set<String> set = new HashSet<>();

		int N = Integer.parseInt(br.readLine());

		for (int n = 0; n < N; n++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
			String cmd = st.nextToken();

			if (cmd.equals("enter")) set.add(name);
			else set.remove(name);
		}

		StringBuilder sb = new StringBuilder();
		String[] list = set.toArray(String[]::new);
		Arrays.sort(list, Collections.reverseOrder());

		Arrays.stream(list).forEach(str -> sb.append(str).append("\n"));

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
