import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<Integer, String> numToName = new HashMap<>();
		Map<String, Integer> nameToNum = new HashMap<>();

		for (int i = 1; i <= N; i++) {
			String str = br.readLine();

			numToName.put(i, str);
			nameToNum.put(str, i);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			String str = br.readLine();

			if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
				sb.append(numToName.get(Integer.parseInt(str))).append("\n");
			} else {
				sb.append(nameToNum.get(str)).append("\n");
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
